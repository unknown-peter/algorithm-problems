/**
 * Leetcode - factorial_trailing_zeroes
 */
package com.algorithm.problems.factorial_trailing_zeroes;

class Solution2 implements Solution {

    /**
     * 找0到n中5的个数。不断除以5，为含有一个5、两个5...的数字个数
     */
    @Override
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }
}
