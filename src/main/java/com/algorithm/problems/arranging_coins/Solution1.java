/**
 * Leetcode - arranging_coins
 */
package com.algorithm.problems.arranging_coins;

class Solution1 implements Solution {

    @Override
    public int arrangeCoins(int n) {
        int i = (int) Math.sqrt((double) 2 * n);
        while (i * (i + 1) > 2 * n) i--;
        return i;
    }
}
