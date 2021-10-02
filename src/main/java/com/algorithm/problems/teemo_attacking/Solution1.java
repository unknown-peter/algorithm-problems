/**
 * Leetcode - teemo_attacking
 */
package com.algorithm.problems.teemo_attacking;

class Solution1 implements Solution {

    @Override
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int tmp = Integer.MIN_VALUE;
        int total = 0;
        for (int time : timeSeries) {
            if (time >= (tmp + duration)) total += duration;
            else total += time - tmp;
            tmp = time;
        }
        return total;

//        int n = timeSeries.length;
//        if (n == 0) return 0;
//
//        int total = 0;
//        for(int i = 0; i < n - 1; ++i)
//            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
//        return total + duration;
    }
}
