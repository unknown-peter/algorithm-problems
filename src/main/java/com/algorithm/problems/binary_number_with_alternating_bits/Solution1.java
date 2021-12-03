/**
 * Leetcode - binary_number_with_alternating_bits
 */
package com.algorithm.problems.binary_number_with_alternating_bits;

class Solution1 implements Solution {

    @Override
    public boolean hasAlternatingBits(int n) {
        int curBit = n & 1;
        n >>= 1;
        while (n != 0) {
            if (curBit == (n & 1)) return false;
            curBit = n & 1;
            n >>= 1;
        }
        return true;
    }
}
