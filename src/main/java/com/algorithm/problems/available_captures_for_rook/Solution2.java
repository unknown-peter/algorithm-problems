/**
 * Leetcode - available_captures_for_rook
 */
package com.algorithm.problems.available_captures_for_rook;

class Solution2 implements Solution {

    @Override
    public int numRookCaptures(char[][] board) {
        int num = 0;
        int n = board.length;
        int xr = 0;
        int yr = 0;
        int[][] dirs = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R') {
                    xr = i;
                    yr = j;
                    break;
                }
            }
        }

        for (int[] dir : dirs) {
            int x = xr + dir[0];
            int y = yr + dir[1];
            while (x >= 0 && x < n && y >= 0 && y < n) {
                if (board[x][y] == 'B') break;
                if (board[x][y] == 'p') {
                    num++;
                    break;
                }
                x += dir[0];
                y += dir[1];
            }
        }
        return num;
    }
}
