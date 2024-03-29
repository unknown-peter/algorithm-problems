/**
 * Leetcode - arranging_coins
 */
package com.algorithm.problems.arranging_coins;

class Solution1 implements Solution {

    /**
     * 1 + 2 + 3 + ... + i + m = n
     * i*(1+i)/2 + m = n
     * i*i < i*(1+i) <= 2*n
     * i <= sqrt(2*n)
     */
    @Override
    public int arrangeCoins(int n) {
        int i = (int) Math.sqrt((double) 2 * n);
        while (i * (i + 1) > 2 * n) i--;
        return i;
    }
}
