/**
 * Leetcode - counting_bits
 */
package com.algorithm.problems.counting_bits;

class Solution2 implements Solution {

    /**
     * 遍历1-n，若i为偶数，则i中1的个数和i/2中1的个数相同；
     * 若i为奇数，则i中1的个数为i/2中1的个数再加1
     */
    @Override
    public int[] countBits(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) array[i] = array[i / 2];
            else array[i] = array[i / 2] + 1;
        }
        return array;
    }
}
