/**
 * Leetcode - power_of_four
 */
package com.algorithm.problems.power_of_four;

class Solution3 implements Solution {

    @Override
    public boolean isPowerOfFour(int n) {
        return (Math.log10(n) / Math.log10(4)) % 1 == 0;
    }
}
