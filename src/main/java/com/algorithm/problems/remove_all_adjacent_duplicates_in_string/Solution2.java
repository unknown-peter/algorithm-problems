/**
 * Leetcode - remove_all_adjacent_duplicates_in_string
 */
package com.algorithm.problems.remove_all_adjacent_duplicates_in_string;

class Solution2 implements Solution {

    @Override
    public String removeDuplicates(String s) {
        if (s.length() == 1) return s;

        char[] array = s.toCharArray();
        int i = 0;
        for (int j = 0; j < array.length; j++, i++) {
            array[i] = array[j];
            if (i != 0 && array[i - 1] == array[i]) i -= 2;
        }
        return new String(array, 0, i);
    }
}
