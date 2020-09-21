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
        assertEquals(2, new LengthOfLastWord()
                .lengthOfLastWord("hi"));
    }
    @Test
    public void lengthOfLastWordCase3() {
        assertEquals(1, new LengthOfLastWord()
                .lengthOfLastWord("i"));
    }
    @Test
    public void lengthOfLastWordCase4() {
        assertEquals(2, new LengthOfLastWord()
                .lengthOfLastWord("hi "));
    }
    @Test
    public void lengthOfLastWordCase5() {
        assertEquals(10, new LengthOfLastWord()
                .lengthOfLastWord("withSpaces    "));
    }
    @Test
    public void lengthOfLastWordCase6() {
        assertEquals(0, new LengthOfLastWord()
                .lengthOfLastWord(" "));
    }
    @Test
    public void lengthOfLastWordCase7() {
        assertEquals(0, new LengthOfLastWord()
                .lengthOfLastWord("    "));
    }
    @Test
    public void lengthOfLastWordCase8() {
        assertEquals(4, new LengthOfLastWord()
                .lengthOfLastWord("   word"));
    }
    @Test
    public void lengthOfLastWordCase9() {
        assertEquals(17, new LengthOfLastWord()
                .lengthOfLastWord("  wordBetweenSpaces  "));
    }
}