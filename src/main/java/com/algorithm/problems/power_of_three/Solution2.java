/**
 * Leetcode - power_of_three
 */
package com.algorithm.problems.power_of_three;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean isPowerOfThree(int n) {
        return Integer.toString(n, 3).matches("^10*$");
    }
}
