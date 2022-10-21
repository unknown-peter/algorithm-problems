/**
 * Leetcode - spiral_matrix
 */
package com.algorithm.problems.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    /**
     * 定义r、R、c、C作为行最小最大index和列最小最大index，在满足r <= R && c <= C条件时循环遍历
     * 当前最小行r由左至右的元素、下一行开始的当前最大列C由上到下的元素、
     * 当r<R时最大行R从C前一列由右至左的元素、当c<C时最小列c从R前一行由下到上的元素
     * 将上述元素依次放进list中，然后r、c加一，R、C减一
     */
    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        int R = matrix.length - 1;
        int C = matrix[0].length - 1;
        int r = 0;
        int c = 0;
        List<Integer> res = new ArrayList<>();
        while (r <= R && c <= C) {
            for (int i = c; i <= C; i++) res.add(matrix[r][i]);
            for (int i = r + 1; i <= R; i++) res.add(matrix[i][C]);
            if (r < R) {
                for (int i = C - 1; i >= c; i--) res.add(matrix[R][i]);
            }
            if (c < C) {
                for (int i = R - 1; i > r; i--) res.add(matrix[i][c]);
            }
            r++;
            C--;
            R--;
            c++;
        }
        return res;
    }
}
