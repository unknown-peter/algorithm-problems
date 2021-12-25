/**
 * Leetcode - find_smallest_letter_greater_than_target
 */
package com.algorithm.problems.find_smallest_letter_greater_than_target;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (letters[mi] <= target) lo = mi + 1;
            else hi = mi;
        }
        return letters[lo % letters.length];
    }
}
