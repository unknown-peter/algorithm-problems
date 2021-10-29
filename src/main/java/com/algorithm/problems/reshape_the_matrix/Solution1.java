/**
 * Leetcode - reshape_the_matrix
 */
package com.algorithm.problems.reshape_the_matrix;

class Solution1 implements Solution {

    @Override
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;
        int[][] res = new int[r][c];
        int k = 0;
        int l = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[k][l++] = mat[i][j];
                if (l == c) {
                    k++;
                    l = 0;
                }
            }
        }
        return res;
    }
}
