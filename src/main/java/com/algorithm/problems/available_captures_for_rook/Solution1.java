/**
 * Leetcode - available_captures_for_rook
 */
package com.algorithm.problems.available_captures_for_rook;

class Solution1 implements Solution {

    @Override
    public int numRookCaptures(char[][] board) {
        int num = 0;
        int n = board.length;
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        for (int i = y + 1; i < n; i++) {
            if (board[x][i] == 'B') break;
            if (board[x][i] == 'p') {
                num++;
                break;
            }
        }
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] == 'B') break;
            if (board[x][i] == 'p') {
                num++;
                break;
            }
        }
        for (int i = x + 1; i < n; i++) {
            if (board[i][y] == 'B') break;
            if (board[i][y] == 'p') {
                num++;
                break;
            }
        }
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == 'B') break;
            if (board[i][y] == 'p') {
                num++;
                break;
            }
        }
        return num;
    }
}
