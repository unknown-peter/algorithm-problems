/**
 * Leetcode - arranging_coins
 */
package com.algorithm.problems.arranging_coins;

class Solution3 implements Solution {

    @Override
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }
}
