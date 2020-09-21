package com.halmaks.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LargestTimeFromDigitsTest {
    @Test
    public void largestTimeFromDigitsTest1() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{1, 2, 3, 4});
        Assert.assertEquals("23:41", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest2() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{5, 5, 5, 5});
        Assert.assertEquals("", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest3() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{0, 0, 0, 0});
        Assert.assertEquals("00:00", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest4() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{9, 1, 6, 8});
        Assert.assertEquals("", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest5() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{1, 4, 5, 1});
        Assert.assertEquals("15:41", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest6() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{0, 0, 3, 0});
        Assert.assertEquals("03:00", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest7() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{1, 9, 6, 0});
        Assert.assertEquals("19:06", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest8() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{1, 1, 1, 1});
        Assert.assertEquals("11:11", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest9() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{7, 3, 6, 0});
        Assert.assertEquals("07:36", resultTime);
    }
    @Test
    public void largestTimeFromDigitsTest10() {
        LargestTimeFromDigits solution2 = new LargestTimeFromDigits();
        String resultTime = solution2
                .largestTimeFromDigits(new int[]{2, 0, 6, 6});
        Assert.assertEquals("06:26", resultTime);
    }
}