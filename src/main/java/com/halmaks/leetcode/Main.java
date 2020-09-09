package com.halmaks.leetcode;

public class Main {

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution
                .largestTimeFromDigits(new int[]{2, 3, 0, 0}));
        System.out.println(solution
                .largestTimeFromDigits(new int[]{1, 1, 9, 3}));
        System.out.println(solution
                .largestTimeFromDigits(new int[]{1, 3, 0, 5}));
        System.out.println(solution
                .largestTimeFromDigits(new int[]{5, 5, 5, 5}));
    }
}
