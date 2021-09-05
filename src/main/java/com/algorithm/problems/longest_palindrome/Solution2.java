/**
 * Leetcode - longest_palindrome
 */
package com.algorithm.problems.longest_palindrome;

import java.util.BitSet;

class Solution2 implements Solution {

    @Override
    public int longestPalindrome(String s) {
        BitSet bitSet = new BitSet(52);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') bitSet.flip(ch - 'a');
            else if (ch >= 'A' && ch <= 'Z') bitSet.flip(26 + ch - 'A');
        }
        int oddNum = bitSet.cardinality();
        return (oddNum == 0) ? s.length() : (s.length() - oddNum + 1);
    }
}
