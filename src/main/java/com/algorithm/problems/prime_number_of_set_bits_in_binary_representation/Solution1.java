/**
 * Leetcode - prime_number_of_set_bits_in_binary_representation
 */
package com.algorithm.problems.prime_number_of_set_bits_in_binary_representation;

class Solution1 implements Solution {

    private boolean[] numPrime = new boolean[]{false, false, true, true, false, true, false, true, false, false, false, true, false, true, false, false, false, true, false, true};

    @Override
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (numPrime[getNumberBits(i)]) count++;
        }
        return count;
    }

    private int getNumberBits(int num) {
        int countBits = 0;
        while (num != 0) {
            if ((num & 1) == 1) countBits++;
            num >>= 1;
        }
        return countBits;
    }
}
