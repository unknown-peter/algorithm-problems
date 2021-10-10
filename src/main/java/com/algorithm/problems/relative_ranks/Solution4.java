/**
 * Leetcode - relative_ranks
 */
package com.algorithm.problems.relative_ranks;

class Solution4 implements Solution {

    /**
     * 获取最大的score[m]，创建长度为score[m]+1的int数组，数组中score[i]位置放入其在score中的索引(从1开始)
     * 遍历数组，遇到非0的元素则设置String数组对应位置值
     */
    @Override
    public String[] findRelativeRanks(int[] score) {
        int max = 0;
        for (int s : score) max = Math.max(max, s);
        int[] bucket = new int[max + 1];
        for (int i = 0; i < score.length; i++) bucket[score[i]] = i + 1;

        int medal = 1;
        String[] ranks = new String[score.length];
        for (int i = max; i >= 0; i--) {
            if (bucket[i] != 0) {
                if (medal == 1) ranks[bucket[i] - 1] = "Gold Medal";
                else if (medal == 2) ranks[bucket[i] - 1] = "Silver Medal";
                else if (medal == 3) ranks[bucket[i] - 1] = "Bronze Medal";
                else ranks[bucket[i] - 1] = String.valueOf(medal);
                medal++;
            }
        }
        return ranks;
    }
}
