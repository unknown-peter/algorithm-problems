/**
 * Leetcode - find_the_town_judge
 */
package com.algorithm.problems.find_the_town_judge;

class Solution2 implements Solution {

    /**
     * 计算每个人的入度和出度，如果是judge的话，其他所有人都相信他，他不相信其他所有人；入度应为n-1，出度应为0
     */
    @Override
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int[] pair : trust) {
            out[pair[0]]++;
            in[pair[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (in[i] == n - 1 && out[i] == 0) return i;
        }
        return -1;
    }
}
