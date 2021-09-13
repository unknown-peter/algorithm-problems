/**
 * Leetcode - number_of_segments_in_a_string
 */
package com.algorithm.problems.number_of_segments_in_a_string;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
}
