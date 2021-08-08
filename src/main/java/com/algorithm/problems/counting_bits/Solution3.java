/**
 * Leetcode - counting_bits
 */
package com.algorithm.problems.counting_bits;

class Solution3 implements Solution {

    /**
     * 遍历1-n，i中1的个数为i&(i-1)中1的个数再加1
     */
    @Override
    public int[] countBits(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        for (int i = 1; i <= n; i++) {
            array[i] = array[i & (i - 1)] + 1;
        }
        return array;
    }
}
