/**
 * Leetcode - valid_anagram
 */
package com.algorithm.problems.valid_anagram;

import java.util.Arrays;

class Solution2 implements Solution {

    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
