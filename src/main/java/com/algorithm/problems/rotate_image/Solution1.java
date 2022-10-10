/**
 * Leetcode - rotate_image
 */
package com.algorithm.problems.rotate_image;

class Solution1 implements Solution {

    /**
     * 对于数字组成的矩阵matrix，对其每i层矩形n-1-2*i个元素进行旋转换位操作
     */
    @Override
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = tmp;
            }
        }
    }

    //    public void rotate(int[][] matrix) {
    //        int n = matrix.length;
    //        for (int i = 0; i < (n + 1) / 2; i ++) {
    //            for (int j = 0; j < n / 2; j++) {
    //                int temp = matrix[n - 1 - j][i];
    //                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
    //                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
    //                matrix[j][n - 1 - i] = matrix[i][j];
    //                matrix[i][j] = temp;
    //            }
    //        }
    //    }
}
