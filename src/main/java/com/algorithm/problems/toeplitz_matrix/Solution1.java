/**
 * Leetcode - toeplitz_matrix
 */
package com.algorithm.problems.toeplitz_matrix;

class Solution1 implements Solution {

    @Override
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1) return true;
        int[] row = new int[matrix[0].length];
        System.arraycopy(matrix[0], 0, row, 0, row.length);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < row.length; j++) {
                if (row[j - 1] != matrix[i][j]) return false;
            }
            System.arraycopy(matrix[i], 0, row, 0, row.length);
        }
        return true;
    }
}
