/**
 * Leetcode - powx_n
 */
package com.algorithm.problems.powx_n;

class Solution1 implements Solution {

    /**
     * 通过累计乘x计算幂次结果。依据x^2n=(x^2)^n，当前计算的幂次小于总幂次的一半时，res自乘且cnt乘2快速计算
     */
    @Override
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (x == 1.0) return 1.0;
        if (x == -1.0) return ((n & 1) == 0) ? 1.0 : -1.0;
        if (n == Integer.MIN_VALUE) return 0.0;

        int pow = n;
        if (n < 0) {
            x = 1 / x;
            pow = -n;
        }
        int cnt = 1;
        double res = x;
        while (cnt < pow) {
            if (res >= 10000.0 || res <= -10000.0 || Math.abs(res) <= 0.00001) return res;
            if (cnt < pow / 2) {
                res *= res;
                cnt *= 2;
            } else {
                res *= x;
                cnt++;
            }
        }
        return res;
    }
}
