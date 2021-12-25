/**
 * Leetcode - find_smallest_letter_greater_than_target
 */
package com.algorithm.problems.find_smallest_letter_greater_than_target;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] seen = new boolean[26];
        for (char c : letters)
            seen[c - 'a'] = true;

        while (true) {
            target++;
            if (target > 'z') target = 'a';
            if (seen[target - 'a']) return target;
        }
    }
}
