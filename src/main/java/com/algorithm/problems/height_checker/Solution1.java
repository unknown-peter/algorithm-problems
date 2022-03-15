/**
 * Leetcode - height_checker
 */
package com.algorithm.problems.height_checker;

import java.util.Arrays;

class Solution1 implements Solution {

    @Override
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(expected);

        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) res++;
        }
        return res;
    }
}
