/**
 * Leetcode - image_smoother
 */
package com.algorithm.problems.image_smoother;

class Solution2 implements Solution {

    @Override
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int sum = img[i][j];
                int count = 1;

                if (i > 0) {
                    sum += img[i - 1][j];
                    count++;
                    if (j > 0) {
                        sum += img[i - 1][j - 1];
                        count++;
                    }
                    if (j < n - 1) {
                        sum += img[i - 1][j + 1];
                        count++;
                    }
                }
                if (i < m - 1) {
                    sum += img[i + 1][j];
                    count++;
                    if (j > 0) {
                        sum += img[i + 1][j - 1];
                        count++;
                    }
                    if (j < n - 1) {
                        sum += img[i + 1][j + 1];
                        count++;
                    }
                }

                if (j > 0) {
                    sum += img[i][j - 1];
                    count++;
                }
                if (j < n - 1) {
                    sum += img[i][j + 1];
                    count++;
                }

                res[i][j] = sum / count;
            }
        }
        return res;
    }
}
