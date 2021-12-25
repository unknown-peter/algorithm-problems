/**
 * Leetcode - find_smallest_letter_greater_than_target
 */
package com.algorithm.problems.find_smallest_letter_greater_than_target;

class Solution1 implements Solution {

    @Override
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) return letter;
        }
        return letters[0];
    }
}
