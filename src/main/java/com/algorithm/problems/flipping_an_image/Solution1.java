/**
 * Leetcode - flipping_an_image
 */
package com.algorithm.problems.flipping_an_image;

class Solution1 implements Solution {

    @Override
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;

        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = image[i][n - 1 - j] ^ 1;
            }
        }
        return res;
    }
}
