/**
 * Leetcode - power_of_two
 */
package com.algorithm.problems.power_of_two;

class Solution1 implements Solution {

    @Override
    public boolean isPowerOfTwo(int n) {
        return (n > 0 && (n & (n - 1)) == 0);
    }
}
