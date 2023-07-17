package com.code.test.characters.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConsecutiveCharactersServTest {
    @Autowired
    ConsecutiveCharsService consecutiveCharsService;

    /**
     * Test case 1: checks if the consecutive identical characters are removed correctly
     */
    @Test
    void removeConsecutiveCharsServer1() {
        String input1 = "aabcccbbad";
        String expected1 = "d";
        String output1 = consecutiveCharsService.removeConsecutiveChars(input1);
        assertEquals(expected1, output1);
    }

    /**
     * Test case 2: checks if the consecutive identical characters are replaced correctly
     */
    @Test
    void replaceConsecutiveCharsServer2() {
        String input1 = "abcccbad";
        String expected1 = "d";
        String output1 = consecutiveCharsService.replaceConsecutiveChars(input1);
        assertEquals(expected1, output1);
    }

    /**
     * Test case 3: test more than 3 consecutive identical characters
     */
    @Test
    void replaceConsecutiveCharsServer3() {
        String input1 = "aaaabbbbbcccccdddd";
        String expected1 = "abc";
        String output1 = consecutiveCharsService.replaceConsecutiveChars(input1);
        assertEquals(expected1, output1);
    }

    /**
     * Test case 4: consecutive identical characters at the end of the string
     */
    @Test
    void replaceConsecutiveCharsServer4() {
        String input1 = "aabcccbaaa";
        String expected1 = "";
        String output1 = consecutiveCharsService.replaceConsecutiveChars(input1);
        assertEquals(expected1, output1);
    }

    /**
     * Test case 5: no consecutive identical characters in the string, it remains unchanged
     */
    @Test
    void replaceConsecutiveCharsServer5() {
        String input1 = "abcdefg";
        String expected1 = "abcdefg";
        String output1 = consecutiveCharsService.replaceConsecutiveChars(input1);
        assertEquals(expected1, output1);
    }

    /**
     * Test case 6: an empty string
     */
    @Test
    void replaceConsecutiveCharsServer6() {
        String input1 = "";
        String expected1 = "";
        String output1 = consecutiveCharsService.replaceConsecutiveChars(input1);
        assertEquals(expected1, output1);
    }

    /**
     * Test case 7: null pass in
     */
    @Test
    void replaceConsecutiveCharsServer7() {
        String input1 = null;
        String expected1 = null;
        String output1 = consecutiveCharsService.replaceConsecutiveChars(input1);
        assertEquals(expected1, output1);
    }
}