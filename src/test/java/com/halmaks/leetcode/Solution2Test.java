package com.halmaks.leetcode;

import junit.framework.TestCase;

class Solution2Test extends TestCase {
    @org.junit.jupiter.api.Test
    void largestTimeFromDigitsTest1() {
        Solution2 solution = new Solution2();
        String resultTime = solution
                .largestTimeFromDigits(new int[]{1, 4, 5, 1});
        assertEquals("15:41", resultTime);
    }
    @org.junit.jupiter.api.Test
    void largestTimeFromDigitsTest2() {
        Solution2 solution = new Solution2();
        String resultTime = solution
                .largestTimeFromDigits(new int[]{1, 4, 5, 1});
        assertEquals("15:41", resultTime);
    }
    @org.junit.jupiter.api.Test
    void largestTimeFromDigitsTest3() {
        Solution2 solution = new Solution2();
        String resultTime = solution
                .largestTimeFromDigits(new int[]{1, 4, 5, 1});
        assertEquals("15:41", resultTime);
    }
}