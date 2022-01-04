/**
 * Leetcode - prime_number_of_set_bits_in_binary_representation
 */
package com.algorithm.problems.prime_number_of_set_bits_in_binary_representation;

class Solution2 implements Solution {

    /**
     * 将第i位中i为素数的位置为1，得到数665772.
     * 计算从left到right数的bit数，将665772右移相应位数看末位是否为1
     */
    @Override
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        while (left <= right)
            count += 665772 >> Integer.bitCount(left++) & 1;
        return count;
    }
}
