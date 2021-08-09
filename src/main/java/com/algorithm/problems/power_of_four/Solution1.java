/**
 * Leetcode - power_of_four
 */
package com.algorithm.problems.power_of_four;

class Solution1 implements Solution {

    @Override
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}
