/**
 * Leetcode - reverse_bits
 */
package com.algorithm.problems.reverse_bits;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int reverseBits(int n) {
        int ret = 0;
        int power = 31;
        while (n != 0) {
            ret += (n & 1) << power;
            n >>>= 1;
            power--;
        }
        return ret;
    }
}
