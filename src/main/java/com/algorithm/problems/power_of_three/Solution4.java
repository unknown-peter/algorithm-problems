/**
 * Leetcode - power_of_three
 */
package com.algorithm.problems.power_of_three;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
