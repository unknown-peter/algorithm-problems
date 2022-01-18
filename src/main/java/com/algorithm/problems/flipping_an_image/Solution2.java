/**
 * Leetcode - flipping_an_image
 */
package com.algorithm.problems.flipping_an_image;

class Solution2 implements Solution {

    @Override
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        for (int[] row : image) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[n - 1 - i] ^ 1;
                row[n - 1 - i] = tmp;
            }
        }
        return image;
    }
}
