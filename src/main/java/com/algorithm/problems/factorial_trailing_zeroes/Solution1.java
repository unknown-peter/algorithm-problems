/**
 * Leetcode - factorial_trailing_zeroes
 */
package com.algorithm.problems.factorial_trailing_zeroes;

class Solution1 implements Solution {

    @Override
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i = i + 5) {
            int num = i;
            while (num > 0 && num % 5 == 0) {
                num = num / 5;
                count++;
            }
        }
        return count;
    }
}
