/**
 * Leetcode - number_of_recent_calls
 */
package com.algorithm.problems.number_of_recent_calls;

import java.util.LinkedList;

class Solution2 implements Solution {

    @Override
    public Integer[] recentCounterOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        Solution1.RecentCounter recentCounter = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "RecentCounter":
                    recentCounter = new Solution1.RecentCounter();
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

    /**
     * solution from leetcode
     * 滑动窗口
     */
    static class RecentCounter {
        LinkedList<Integer> slideWindow;

        public RecentCounter() {
            this.slideWindow = new LinkedList<Integer>();
        }

        public int ping(int t) {
            // step 1). append the current call
            this.slideWindow.addLast(t);

            // step 2). invalidate the outdated pings
            while (this.slideWindow.getFirst() < t - 3000)
                this.slideWindow.removeFirst();

            return this.slideWindow.size();
        }
    }
}
