/**
 * Leetcode - power_of_three
 */
package com.algorithm.problems.power_of_three;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
