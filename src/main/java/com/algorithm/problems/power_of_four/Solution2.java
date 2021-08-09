/**
 * Leetcode - power_of_four
 */
package com.algorithm.problems.power_of_four;

class Solution2 implements Solution {

    @Override
    public boolean isPowerOfFour(int n) {
        return Integer.toString(n, 4).matches("^10*$");
    }
}
