/**
 * Leetcode - power_of_two
 */
package com.algorithm.problems.power_of_two;

class Solution2 implements Solution {

    @Override
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 0x00000001) == 1) count++;
            n >>= 1;
        }
        return count == 1;
    }
}
