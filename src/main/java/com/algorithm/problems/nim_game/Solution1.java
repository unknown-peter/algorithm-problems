/**
 * Leetcode - nim_game
 */
package com.algorithm.problems.nim_game;

class Solution1 implements Solution {

    @Override
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
