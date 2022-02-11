/**
 * Leetcode - number_of_recent_calls
 */
package com.algorithm.problems.number_of_recent_calls;

class Solution1 implements Solution {

    @Override
    public Integer[] recentCounterOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        RecentCounter recentCounter = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "RecentCounter":
                    recentCounter = new RecentCounter();
                    result[i] = null;
                    break;
                case "ping":
                    result[i] = recentCounter.ping(data[i][0]);
                    ;
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class RecentCounter {

        private int[] requestTime;

        private int curNum;

        private int leftIndex;

        public RecentCounter() {
            requestTime = new int[10000];
            curNum = 0;
            leftIndex = 0;
        }

        public int ping(int t) {
            int res;
            if (curNum == 0) res = 1;
            else {
                int leftPoint = t - 3000;
                while (leftIndex < curNum) {
                    // 如果左边索引大于等于范围左边界，break；否则左边索引继续递增向右滑动
                    if (requestTime[leftIndex] >= leftPoint) break;
                    leftIndex++;
                }
                res = curNum - leftIndex + 1;
            }
            requestTime[curNum++] = t;
            return res;
        }
    }
}
