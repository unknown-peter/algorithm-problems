/**
 * Leetcode - first_unique_character_in_a_string
 */
package com.algorithm.problems.first_unique_character_in_a_string;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (!set.contains(charArray[i]) && s.indexOf(charArray[i], i + 1) == -1) return i;
            set.add(charArray[i]);
        }
        return -1;
    }
}
