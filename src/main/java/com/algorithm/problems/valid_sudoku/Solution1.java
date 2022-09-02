/**
 * Leetcode - valid_sudoku
 */
package com.algorithm.problems.valid_sudoku;

class Solution1 implements Solution {

    /**
     * 依次计算当前行、列、九宫格内数字个数，如果有重复的则返回false
     */
    @Override
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int[] row = new int[10];
            int[] column = new int[10];
            int[] box = new int[10];

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int ind = board[i][j] - '0';
                    if (row[ind] > 0) return false;
                    row[ind]++;
                }
                if (board[j][i] != '.') {
                    int ind = board[j][i] - '0';
                    if (column[ind] > 0) return false;
                    column[ind]++;
                }
                if (board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] != '.') {
                    int ind = board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] - '0';
                    if (box[ind] > 0) return false;
                    box[ind]++;
                }
            }
        }
        return true;
    }
}
