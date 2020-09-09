package com.halmaks.leetcode;

public class Solution2 {
    /*
     *  Given an array of 4 digits, return the largest 24 hour time that
     *  can be made.
     *  The smallest 24 hour time is 00:00, and the largest is 23:59.
     *  Starting from 00:00, a time is larger if more time has elapsed
     *  since midnight.
     *  Return the answer as a string of length 5.  If no valid time can
     *  be made, return an empty string.
     *  arr.length == 4
     *  0 <= arr[i] <= 9
     */
    public String largestTimeFromDigits(int[] arr) {
        final int HOURS_MAX_VALUE = 23;
        final int MINUTES_MAX_VALUE = 59;
        int tmp = 0;
        int max = -1;

        int[][] algorithm = new int[][]{
                {0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3},
                {1, 0, 0, 0, 2, 2, 1, 1, 3, 3, 3, 2}
        };
        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < 12; i++) {
            tmp = arr[algorithm[0][i]] * 10 + arr[algorithm[1][i]];
            if (tmp >= max && tmp <= HOURS_MAX_VALUE) {
                max = tmp;
                indexOne = algorithm[0][i];
                indexTwo = algorithm[1][i];
            }
        }

        String hours;
        if (max < 0) {
            return "";
        } else if (max < 10) {
            hours = "0" + max;
        } else {
            hours = "" + max;
        }

        int[] minutesDigits = new int[2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != indexOne && i != indexTwo) {
                minutesDigits[j] = arr[i];
                j++;
            }
        }
        String minutes;
        int minutesCaseOne = minutesDigits[0] * 10 + minutesDigits[1];
        int minutesCaseTwo = minutesDigits[1] * 10 + minutesDigits[0];
        if (minutesCaseOne >= minutesCaseTwo && minutesCaseOne <= MINUTES_MAX_VALUE) {
            if (minutesCaseOne < 10) {
                return hours + ":0" + minutesCaseOne;
            } else {
                return hours + ":" + minutesCaseOne;
            }
        }
        if (minutesCaseTwo <= MINUTES_MAX_VALUE) {
            if(minutesCaseTwo < 10) {
                return hours + ":0" + minutesCaseTwo;
            } else {
                return hours + ":" + minutesCaseTwo;
            }
        }
        return "";
    }
}
