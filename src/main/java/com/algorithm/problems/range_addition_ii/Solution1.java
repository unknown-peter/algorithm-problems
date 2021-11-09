/**
 * Leetcode - range_addition_ii
 */
package com.algorithm.problems.range_addition_ii;

class Solution1 implements Solution {

    @Override
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        if (ops.length == 1) return ops[0][0] * ops[0][1];
        int[][] matrix = new int[m][n];
        for (int i = 0; i < ops.length; i++) {
            for (int r = 0; r < ops[i][0]; r++) {
                for (int c = 0; c < ops[i][1]; c++) {
                    matrix[r][c]++;
                }
            }
        }
        int[] count = new int[ops.length + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count[matrix[i][j]]++;
            }
        }
        for (int i = ops.length; i >= 0; i--) {
            if (count[i] > 0) return count[i];
        }
        return 0;
    }
}
