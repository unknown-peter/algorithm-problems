/**
 * Leetcode - toeplitz_matrix
 */
package com.algorithm.problems.toeplitz_matrix;

import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 两点在同一条斜线上需要满足坐标r-c相等。存储r-c为key，值为value，计算同一r-c的值是否与之相等
     */
    @Override
    public boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> groups = new HashMap();
        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix[0].length; ++c) {
                if (!groups.containsKey(r - c))
                    groups.put(r - c, matrix[r][c]);
                else if (groups.get(r - c) != matrix[r][c])
                    return false;
            }
        }
        return true;
    }
}
