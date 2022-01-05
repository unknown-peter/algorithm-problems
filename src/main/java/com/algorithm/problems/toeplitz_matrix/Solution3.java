/**
 * Leetcode - toeplitz_matrix
 */
package com.algorithm.problems.toeplitz_matrix;

class Solution3 implements Solution {

    /**
     * 从第1行到第n-1行，和下一行下一列的值比较是否相等
     */
    @Override
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
