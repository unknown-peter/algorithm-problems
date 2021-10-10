/**
 * Leetcode - relative_ranks
 */
package com.algorithm.problems.relative_ranks;

import javafx.util.Pair;

import java.util.PriorityQueue;

class Solution2 implements Solution {

    /**
     * 使用优先队列存储每人的score和index的pair，优先队列按照score倒序排列
     * 依次从头取出优先队列内的值并设置String数组对应位置值
     */
    @Override
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getKey().compareTo(o1.getKey()));
        for (int i = 0; i < score.length; i++)
            queue.add(new Pair<>(score[i], i));
        String[] ranks = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            Pair<Integer, Integer> scoreIndex = queue.poll();
            if (i == 0) ranks[scoreIndex.getValue()] = "Gold Medal";
            else if (i == 1) ranks[scoreIndex.getValue()] = "Silver Medal";
            else if (i == 2) ranks[scoreIndex.getValue()] = "Bronze Medal";
            else ranks[scoreIndex.getValue()] = String.valueOf(i + 1);
        }
        return ranks;
    }
}
