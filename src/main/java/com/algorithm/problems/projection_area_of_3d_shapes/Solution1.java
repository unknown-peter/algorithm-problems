/**
 * Leetcode - projection_area_of_3d_shapes
 */
package com.algorithm.problems.projection_area_of_3d_shapes;

class Solution1 implements Solution {

    @Override
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xMax;
        int yMax;
        int res = 0;
        for (int i = 0; i < n; i++) {
            xMax = 0;
            yMax = 0;
            for (int j = 0; j < n; j++) {
                xMax = Math.max(xMax, grid[i][j]);
                yMax = Math.max(yMax, grid[j][i]);
                if (grid[i][j] > 0) res++;
            }
            res += xMax + yMax;
        }
        return res;
    }
}
