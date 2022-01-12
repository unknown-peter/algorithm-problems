/**
 * Leetcode - number_of_lines_to_write_string
 */
package com.algorithm.problems.number_of_lines_to_write_string;

class Solution1 implements Solution {

    @Override
    public int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int curLinePixels = 0;
        for (char ch : s.toCharArray()) {
            int width = widths[ch - 'a'];
            curLinePixels += width;
            if (curLinePixels > 100) {
                curLinePixels = width;
                line++;
            }
        }
        return new int[]{line, curLinePixels};
    }
}
