/**
 * Leetcode - reshape_the_matrix
 */
package com.algorithm.problems.reshape_the_matrix;

class Solution2 implements Solution {

    @Override
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;
        int[][] res = new int[r][c];
        int n = mat[0].length;
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                k = i * c + j;
                res[i][j] = mat[k / n][k % n];
            }
        }
        return res;
    }
}
