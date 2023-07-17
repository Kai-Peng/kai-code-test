package com.code.test.characters.impl;

import com.code.test.characters.ConsecutiveCharsInterface;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class RemoveConsecutiveCharsImpl implements ConsecutiveCharsInterface {
    @Override
    public String handleChars(String input, Pattern pattern) {
        if(input == null || pattern == null) return null;

        while (pattern.matcher(input).find()) {
            input = pattern.matcher(input).replaceFirst("");
        }

        return input;
    }
}
