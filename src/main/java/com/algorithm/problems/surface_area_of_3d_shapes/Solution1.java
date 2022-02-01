/**
 * Leetcode - surface_area_of_3d_shapes
 */
package com.algorithm.problems.surface_area_of_3d_shapes;

class Solution1 implements Solution {

    /**
     * 计算每个的面积，并减掉和左边及上边重合的部分
     */
    @Override
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) sum += 4 * grid[i][j] + 2;
                if (j > 0) sum -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
                if (i > 0) sum -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
            }
        }
        return sum;
    }
}
