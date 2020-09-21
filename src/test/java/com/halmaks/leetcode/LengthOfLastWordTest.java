package com.halmaks.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest{
    @Test
    public void lengthOfLastWordCase1() {
        assertEquals(9, new LengthOfLastWord()
                .lengthOfLastWord("Hi, last Word is superWord"));
    }
    @Test
    public void lengthOfLastWordCase2() {
        assertEquals(0, new LengthOfLastWord()
                .lengthOfLastWord("hi"));
    }
}