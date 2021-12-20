/**
 * Leetcode - problem_1_bit_and_2_bit_characters
 */
package com.algorithm.problems.problem_1_bit_and_2_bit_characters;

class Solution2 implements Solution {

    @Override
    public boolean isOneBitCharacter(int[] bits) {
        return isOneBitCharacter(bits, 0);
    }

    private boolean isOneBitCharacter(int[] bits, int index) {
        if (index >= bits.length - 1) return index == bits.length - 1;
        index += bits[index] + 1;
        return isOneBitCharacter(bits, index);
    }
}
