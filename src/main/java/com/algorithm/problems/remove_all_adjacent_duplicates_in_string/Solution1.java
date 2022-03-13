/**
 * Leetcode - remove_all_adjacent_duplicates_in_string
 */
package com.algorithm.problems.remove_all_adjacent_duplicates_in_string;

class Solution1 implements Solution {

    @Override
    public String removeDuplicates(String s) {
        if (s.length() == 1) return s;

        char[] res = new char[s.length()];
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (i != 0 && res[i - 1] == ch) i -= 1;
            else res[i++] = ch;
        }
        return new String(res, 0, i);
    }
}
