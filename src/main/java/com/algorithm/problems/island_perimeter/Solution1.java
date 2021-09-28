/**
 * Leetcode - island_perimeter
 */
package com.algorithm.problems.island_perimeter;

class Solution1 implements Solution {

    /**
     * 遍历计算1的个数n及每个1右边下边联接的数量c，总的边界长度即为 4n-2c
     * <p>
     * 0 1 0 0
     * 1 1 1 0
     * 0 1 0 0
     * 1 1 0 0
     */
    @Override
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int connect = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if ((j + 1) < col && grid[i][j + 1] == 1) connect++;
                    if ((i + 1) < row && grid[i + 1][j] == 1) connect++;
                    count++;
                }
            }
        }
        return 4 * count - 2 * connect;
    }
}
