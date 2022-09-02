/**
 * Leetcode - valid_sudoku
 */
package com.algorithm.problems.valid_sudoku;

class Solution2 implements Solution {

    /**
     * 遍历每个元素，查找它所在的行、列、九宫格是否已有该数字，如果已有则返回false
     */
    @Override
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][10];
        int[][] column = new int[9][10];
        int[][] box = new int[9][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - '0';
                int boxInd = i / 3 * 3 + j / 3;
                if (row[i][num] > 0 || column[j][num] > 0 || box[boxInd][num] > 0) return false;

                row[i][num]++;
                column[j][num]++;
                box[boxInd][num]++;
            }
        }
        return true;
    }
}
