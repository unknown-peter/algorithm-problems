/**
 * Leetcode - power_of_three
 */
package com.algorithm.problems.power_of_three;

class Solution1 implements Solution {

    @Override
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
