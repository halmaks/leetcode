package com.halmaks.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class LengthOfLastWordTest extends TestCase {

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