package com.halmaks.leetcode;

public class ContainsNearbyAlmostDuplicate {
    /*
    containsNearbyAlmostDuplicate:
    Given an array of integers, find out whether there are two distinct
    indices i and j in the array such that the absolute difference between
    nums[i] and nums[j] is at most t and the absolute difference between
    i and j is at most k.

    Учитывая массив целых чисел, выясните, есть ли в массиве два различных
    индекса i и j, так что абсолютная разница между nums [i] и nums [j] не
    превышает t, а абсолютная разница между i и j не превышает k.
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            if(j <= nums.length +1) {
                j = i + 1;
            } else {
                return false;
            }
            while(Math.abs(i - j) <= k && j < nums.length) {
                if(Math.abs((long) nums[i] - nums[j]) <= t) {
                    return true;
                }
                j++;
            }

        }
        return false;
    }

}
