/**
 * Leetcode - relative_ranks
 */
package com.algorithm.problems.relative_ranks;

import java.util.Arrays;

class Solution3 implements Solution {

    /**
     * 使用数组存储0-n的index，根据score对该index数组倒序排序
     * 遍历index数组并设置String数组对应位置值
     */
    @Override
    public String[] findRelativeRanks(int[] score) {
        Integer[] index = new Integer[score.length];
        for (int i = 0; i < score.length; i++) index[i] = i;
        Arrays.sort(index, (o1, o2) -> Integer.compare(score[o2], score[o1]));

        String[] ranks = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            if (i == 0) ranks[index[i]] = "Gold Medal";
            else if (i == 1) ranks[index[i]] = "Silver Medal";
            else if (i == 2) ranks[index[i]] = "Bronze Medal";
            else ranks[index[i]] = String.valueOf(i + 1);
        }
        return ranks;
    }
}
