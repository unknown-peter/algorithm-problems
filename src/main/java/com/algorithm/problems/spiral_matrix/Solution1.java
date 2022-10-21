/**
 * Leetcode - spiral_matrix
 */
package com.algorithm.problems.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    private int[][] direction = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    /**
     * 使用direction数组表示向右、向下、向左、向上四个方向
     * 从matrix的(0,0)元素开始沿指定方向依次放入list中，并将对应元素置为Integer.MIN_VALUE
     * 当下一个方向元素的索引不在matrix索引范围，或者元素值为Integer.MIN_VALUE已遍历过，则更换direction下一个方向遍历
     */
    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        int ind = 0;
        List<Integer> res = new ArrayList<>();
        while (i >= 0 && i < m && j >= 0 && j < n && matrix[i][j] != Integer.MIN_VALUE) {
            res.add(matrix[i][j]);
            matrix[i][j] = Integer.MIN_VALUE;
            if ((i + direction[ind][0]) < 0 || (i + direction[ind][0]) >= m
                    || (j + direction[ind][1]) < 0 || (j + direction[ind][1]) >= n
                    || matrix[i + direction[ind][0]][j + direction[ind][1]] == Integer.MIN_VALUE) {
                ind = (ind == 3) ? 0 : (ind + 1);
            }
            i = i + direction[ind][0];
            j = j + direction[ind][1];
        }
        return res;
    }
}
