/**
 * Leetcode - matrix_cells_in_distance_order
 */
package com.algorithm.problems.matrix_cells_in_distance_order;

class Solution2 implements Solution {

    /**
     * 计算可能的最大距离maxDist
     * 由坐标(rCenter,cCenter)正上方往左下、右下、右上、左上呈菱形遍历有效的坐标点
     * 遍历一圈的点距(rCenter,cCenter)距离均相等，从距离为1开始到距离maxDist逐层遍历即可
     * <p>
     * x x x x x
     * x x x x x
     * x x x o x
     * x x x x x
     */
    @Override
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][];
        int maxDist = Math.max(rCenter, rows - 1 - rCenter) + Math.max(cCenter, cols - 1 - cCenter);
        res[0] = new int[]{rCenter, cCenter};
        int index = 1;
        for (int dist = 1; dist <= maxDist; dist++) {
            int r = rCenter - dist;
            int c = cCenter;
            // 向左下
            for (int i = 0; i < dist; i++) {
                if (r >= 0 && c >= 0) res[index++] = new int[]{r, c};
                r++;
                c--;
            }
            // 向右下
            for (int i = 0; i < dist; i++) {
                if (r < rows && c >= 0) res[index++] = new int[]{r, c};
                r++;
                c++;
            }
            // 向右上
            for (int i = 0; i < dist; i++) {
                if (r < rows && c < cols) res[index++] = new int[]{r, c};
                r--;
                c++;
            }
            // 向左上
            for (int i = 0; i < dist; i++) {
                if (r >= 0 && c < cols) res[index++] = new int[]{r, c};
                r--;
                c--;
            }
        }
        return res;
    }
}
