/**
 * Leetcode - divide_two_integers
 */
package com.algorithm.problems.divide_two_integers;

class Solution1 implements Solution {

    /**
     * 对被除数和除数取绝对值，除数倍增到不大于被除数的最大值，然后累积倍数递归计算
     */
    @Override
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1) return (dividend == Integer.MIN_VALUE) ? Integer.MAX_VALUE : -dividend;

        long m = Math.abs((long) dividend);
        long n = Math.abs((long) divisor);
        if (m < n) return 0;

        long res;
        long multiDivisor = n;
        long multi = 1;
        while (m > (multiDivisor << 1)) {
            multiDivisor <<= 1;
            multi <<= 1;
        }
        res = multi + divide((int) (m - multiDivisor), (int) n);
        if ((dividend < 0) ^ (divisor < 0)) res = -res;
        return (int) res;
    }
}
