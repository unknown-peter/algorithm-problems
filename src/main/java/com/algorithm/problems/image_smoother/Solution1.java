/**
 * Leetcode - image_smoother
 */
package com.algorithm.problems.image_smoother;

class Solution1 implements Solution {

    @Override
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] vectors = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] res = new int[m][n];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum = 0;
                int count = 0;
                for (int[] v : vectors) {
                    if (i + v[0] < 0 || i + v[0] > m - 1 || j + v[1] < 0 || j + v[1] > n - 1) continue;
                    sum += img[i + v[0]][j + v[1]];
                    count++;
                }
                res[i][j] = sum / count;
            }
        }
        return res;
    }
}
