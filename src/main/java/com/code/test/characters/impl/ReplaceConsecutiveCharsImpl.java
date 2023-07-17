package com.code.test.characters.impl;

import com.code.test.characters.ConsecutiveCharsInterface;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ReplaceConsecutiveCharsImpl implements ConsecutiveCharsInterface {
    @Override
    public String handleChars(String input, Pattern pattern) {
        if(input == null || pattern == null) return null;

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String matchStr = matcher.group();
            if (matchStr.charAt(0) == 'a') {
                //if the consecutive character is 'a', then replace with empty string
                input = matcher.replaceFirst("");
            } else {
                //replace with a single character that comes before it alphabetically
                char preChar = (char) (matchStr.charAt(0) - 1);
                input = matcher.replaceFirst(String.valueOf(preChar));
            }
            matcher = pattern.matcher(input);
        }

        return input;
    }
}
