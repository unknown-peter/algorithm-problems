/**
 * Leetcode - power_of_four
 */
package com.algorithm.problems.power_of_four;

class Solution4 implements Solution {

    @Override
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) == n;
    }
}
