/**
 * Leetcode - first_unique_character_in_a_string
 */
package com.algorithm.problems.first_unique_character_in_a_string;

class Solution3 implements Solution {

    @Override
    public int firstUniqChar(String s) {
        int index = Integer.MAX_VALUE;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int i = s.indexOf(ch);
            if (i != -1 && i == s.lastIndexOf(ch)) index = Math.min(index, i);
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}
