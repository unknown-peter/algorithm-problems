/**
 * Leetcode - powx_n
 */
package com.algorithm.problems.powx_n;

class Solution2 implements Solution {

    /**
     * 对于幂次pow分解为二进制各位数，各位相加对应x幂次相乘
     * pow右移x自乘，当pow最低位为1时res乘以x
     */
    @Override
    public double myPow(double x, int n) {
        long pow = n;
        if (n < 0) {
            x = 1 / x;
            pow = -pow;
        }
        double res = 1;
        while (pow > 0) {
            if (pow % 2 == 1) res *= x;
            x *= x;
            pow /= 2;
        }
        return res;
    }
}
