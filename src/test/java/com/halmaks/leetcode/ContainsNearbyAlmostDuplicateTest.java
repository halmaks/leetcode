package com.halmaks.leetcode;

import junit.framework.TestCase;

public class ContainsNearbyAlmostDuplicateTest extends TestCase {

    public void testContainsNearbyAlmostDuplicateCase1() {

        int [] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        int t = 0;
        assertEquals(true, new ContainsNearbyAlmostDuplicate()
                .containsNearbyAlmostDuplicate(nums, k, t));
    }

    public void testContainsNearbyAlmostDuplicateCase2() {

        int [] nums = new int[]{1, 0, 1, 1};
        int k = 1;
        int t = 2;
        assertEquals(true, new ContainsNearbyAlmostDuplicate()
                .containsNearbyAlmostDuplicate(nums, k, t));
    }

    public void testContainsNearbyAlmostDuplicateCase3() {

        int [] nums = new int[]{1, 5, 9, 1, 5, 9};
        int k = 2;
        int t = 3;
        assertEquals(false, new ContainsNearbyAlmostDuplicate()
        .containsNearbyAlmostDuplicate(nums, k, t));
    }

    public void testContainsNearbyAlmostDuplicateCase4() {

        int [] nums = new int[]{-2147483648,2147483647};
        int k = 1;
        int t = 1;
        assertEquals(false, new ContainsNearbyAlmostDuplicate()
                .containsNearbyAlmostDuplicate(nums, k, t));
    }

}