/**
 * Leetcode - divide_two_integers
 */
package com.algorithm.problems.divide_two_integers;

class Solution2 implements Solution {

    /**
     * 被除数右移，大于除数的位移倍数累加
     */
    @Override
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1) return (dividend == Integer.MIN_VALUE) ? Integer.MAX_VALUE : -dividend;

        long m = Math.abs((long) dividend);
        long n = Math.abs((long) divisor);
        if (m < n) return 0;

        long res = 0;
        for (int i = 31; i >= 0; i--) {
            if ((m >> i) >= n) {
                m -= (n << i);
                res += (1 << i);
            }
        }

        return ((dividend < 0) ^ (divisor < 0)) ? (int) (-res) : (int) res;
    }
}
