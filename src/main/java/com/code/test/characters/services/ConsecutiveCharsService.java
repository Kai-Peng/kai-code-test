package com.code.test.characters.services;

import com.code.test.characters.ConsecutiveCharsInterface;
import com.code.test.characters.configuration.CharactersMatcherConfig;
import com.code.test.characters.impl.RemoveConsecutiveCharsImpl;
import com.code.test.characters.impl.ReplaceConsecutiveCharsImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ConsecutiveCharsService {
    @Autowired
    CharactersMatcherConfig charactersMatcherConfig;

    @Resource(type = RemoveConsecutiveCharsImpl.class)
    private ConsecutiveCharsInterface removeConsecutiveCharsImpl;

    @Resource(type = ReplaceConsecutiveCharsImpl.class)
    private ConsecutiveCharsInterface replaceConsecutiveCharsImpl;

    public String removeConsecutiveChars(String input) {
        Pattern findByPattern = Pattern.compile(charactersMatcherConfig.getCharactersMatchPattrn());
        return removeConsecutiveCharsImpl.handleChars(input, findByPattern);
    }

    public String replaceConsecutiveChars(String input) {
        Pattern findByPattern = Pattern.compile(charactersMatcherConfig.getCharactersMatchPattrn());
        return replaceConsecutiveCharsImpl.handleChars(input, findByPattern);
    }
}
