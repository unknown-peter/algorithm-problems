/**
 * Leetcode - number_of_segments_in_a_string
 */
package com.algorithm.problems.number_of_segments_in_a_string;

class Solution2 implements Solution {

    @Override
    public int countSegments(String s) {
        int i = 0;
        int count = 0;
        while (i < s.length()) {
            while (i < s.length() && (s.charAt(i) == ' ')) i++;
            if (i < s.length()) count++;
            while (i < s.length() && (s.charAt(i) != ' ')) i++;
        }
        return count;
    }
}
