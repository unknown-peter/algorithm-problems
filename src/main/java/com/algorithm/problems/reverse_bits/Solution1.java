/**
 * Leetcode - reverse_bits
 */
package com.algorithm.problems.reverse_bits;

class Solution1 implements Solution {

    @Override
    public int reverseBits(int n) {
        int i = 0;
        int reverseNum = 0;
        while (n != 0) {
            reverseNum = reverseNum * 2 + (n & 0x00000001);
            i++;
            n >>>= 1;
        }
        for (; i < 32; i++) {
            reverseNum <<= 1;
        }
        return reverseNum;
    }
}
