/**
 * Leetcode - number_of_1_bits
 */
package com.algorithm.problems.number_of_1_bits;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
