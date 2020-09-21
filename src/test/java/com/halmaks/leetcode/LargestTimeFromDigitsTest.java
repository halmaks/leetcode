package com.halmaks.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LargestTimeFromDigitsTest {
    @Test
    public void largestTimeFromDigitsTest1() {
        Assert.assertEquals("23:41", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{1, 2, 3, 4}));
    }
    @Test
    public void largestTimeFromDigitsTest2() {
        Assert.assertEquals("", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{5, 5, 5, 5}));
    }
    @Test
    public void largestTimeFromDigitsTest3() {
        Assert.assertEquals("00:00", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{0, 0, 0, 0}));
    }
    @Test
    public void largestTimeFromDigitsTest4() {
        Assert.assertEquals("", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{9, 1, 6, 8}));
    }
    @Test
    public void largestTimeFromDigitsTest5() {
        Assert.assertEquals("15:41", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{1, 4, 5, 1}));
    }
    @Test
    public void largestTimeFromDigitsTest6() {
        Assert.assertEquals("03:00", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{0, 0, 3, 0}));
    }
    @Test
    public void largestTimeFromDigitsTest7() {
        Assert.assertEquals("19:06", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{1, 9, 6, 0}));
    }
    @Test
    public void largestTimeFromDigitsTest8() {
        Assert.assertEquals("11:11", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{1, 1, 1, 1}));
    }
    @Test
    public void largestTimeFromDigitsTest9() {
        Assert.assertEquals("07:36", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{7, 3, 6, 0}));
    }
    @Test
    public void largestTimeFromDigitsTest10() {
        Assert.assertEquals("06:26", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{2, 0, 6, 6}));
    }
    @Test
    public void largestTimeFromDigitsTest11() {
        Assert.assertEquals("09:29", new LargestTimeFromDigits()
                .largestTimeFromDigits(new int[]{0, 2, 9, 9}));
    }
}