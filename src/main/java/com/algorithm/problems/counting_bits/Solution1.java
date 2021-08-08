/**
 * Leetcode - counting_bits
 */
package com.algorithm.problems.counting_bits;

class Solution1 implements Solution {

    @Override
    public int[] countBits(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int tmp = i;
            int count = 0;
            while (tmp != 0) {
                count += tmp % 2;
                tmp /= 2;
            }
            array[i] = count;
        }
        return array;
    }
}
