/**
 * Leetcode - palindrome_permutation
 */
package com.algorithm.problems.palindrome_permutation;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer count = map.get(s.charAt(i));
            if (count == null) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), ++count);
        }

        boolean hasMiddleChar = false;
        for (Integer c : map.values()) {
            if (hasMiddleChar && c % 2 == 1) return false;
            if (c % 2 == 1) hasMiddleChar = true;
        }
        return true;
    }
}
