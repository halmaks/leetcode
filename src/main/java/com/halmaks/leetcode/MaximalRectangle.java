package com.halmaks.leetcode;


/**
 * https://leetcode.com/problems/maximal-rectangle/description/
 * Given a rows x cols binary
 * matrix filled with 0's and
 * 1's, find the largest
 * rectangle containing only
 * 1's and return its area.
 * Example 1:
 * Input: matrix =
 * [["1","0","1","0","0"],
 * ["1","0","1","1","1"],
 * ["1","1","1","1","1"],
 * ["1","0","0","1","0"]]
 * Output: 6
 * Explanation: The maximal
 * rectangle is shown in the
 * above picture.
 * [.......,"1","1","1"],
 * [.......,"1","1","1"],
 * <p>
 * Example 2:
 * Input: matrix = []
 * Output: 0
 * <p>
 * Example 3:
 * Input: matrix = [["0"]]
 * Output: 0
 * <p>
 * Constraints:
 * rows == matrix.length
 * cols == matrix.length
 * 0 <= row, cols <= 200
 * matrix[i][j] is '0' or '1'.
 */
public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }
        if (matrix.length == 1 && matrix[0][0] == '1') {
            return 1;
        }
        if (matrix.length == 1 && matrix[0][0] == '0') {
            return 0;
        }

        int result = 0;
        int i = 0;
        int j = 0;
        int horizontalCount = 0;
        int verticalCount = 0;
        int maxRect = 0;

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {

                if (matrix[i][j] == '1') {
                    horizontalCount++;
                    continue;
                } else {
                    j = j - horizontalCount;
                    horizontalCount = 0;
                    if (maxRect > horizontalCount) {
                        maxRect = horizontalCount;
                        break;
                    }


                }
            }
            verticalCount++;


        }

        result = maxRect;

        return result;
    }
}
