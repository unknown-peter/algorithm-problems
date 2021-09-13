/**
 * Leetcode - number_of_segments_in_a_string
 */
package com.algorithm.problems.number_of_segments_in_a_string;

class Solution1 implements Solution {

    @Override
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
}
