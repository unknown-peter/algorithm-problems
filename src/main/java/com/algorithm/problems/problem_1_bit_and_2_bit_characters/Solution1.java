/**
 * Leetcode - problem_1_bit_and_2_bit_characters
 */
package com.algorithm.problems.problem_1_bit_and_2_bit_characters;

class Solution1 implements Solution {

    @Override
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
