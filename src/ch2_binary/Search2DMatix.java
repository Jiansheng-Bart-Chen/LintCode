package ch2_binary;
/*
 * 28. Search a 2D Matrix 
 Description
 Notes
 Testcase
 Judge
Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Have you met this question in a real interview? Yes
Example
Consider the following matrix:

[
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 50]
]
Given target = 3, return true.
 */
public class Search2DMatix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 ||
            matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int d1 = matrix.length, d2 = matrix[0].length;
        int l = 0, r = d1 * d2 - 1;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            int val = matrix[m / d2][m % d2];
            if (val == target) {
                return true;
            } else if (val < target) {
                l = m;
            } else {
                r = m;
            }
        }
        if (matrix[l / d2][l % d2] == target || matrix[r / d2][r % d2] == target) {
            return true;
        }
        return false;
    }
}
