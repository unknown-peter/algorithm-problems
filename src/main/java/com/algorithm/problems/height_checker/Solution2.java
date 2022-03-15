/**
 * Leetcode - height_checker
 */
package com.algorithm.problems.height_checker;

class Solution2 implements Solution {

    @Override
    public int heightChecker(int[] heights) {
        int[] heightCount = new int[101];
        for (int height : heights) heightCount[height]++;

        int num = 0;
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            while (heightCount[num] == 0) num++;
            if (heights[i] != num) res++;
            heightCount[num]--;
        }
        return res;
    }
}
