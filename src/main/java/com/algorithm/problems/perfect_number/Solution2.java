/**
 * Leetcode - perfect_number
 */
package com.algorithm.problems.perfect_number;

class Solution2 implements Solution {

    public int pn(int p) {
        return (1 << (p - 1)) * ((1 << p) - 1);
    }

    /**
     * Euclid证明当满足2^p − 1和p均为质数条件时，2^{p−1}(2^p − 1)为even perfect number
     * for p = 2:   2^1(2^2 − 1) = 6
     * for p = 3:   2^2(2^3 − 1) = 28
     * for p = 5:   2^4(2^5 − 1) = 496
     * for p = 7:   2^6(2^7 − 1) = 8128.
     */
    @Override
    public boolean checkPerfectNumber(int num) {
        int[] primes = new int[]{2, 3, 5, 7, 13, 17, 19, 31};
        for (int prime : primes) {
            if (pn(prime) == num)
                return true;
        }
        return false;
    }
}
