/**
 * Leetcode - number_of_1_bits
 */
package com.algorithm.problems.number_of_1_bits;

class Solution1 implements Solution {

    @Override
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
