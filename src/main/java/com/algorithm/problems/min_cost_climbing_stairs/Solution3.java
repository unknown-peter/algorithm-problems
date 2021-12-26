/**
 * Leetcode - min_cost_climbing_stairs
 */
package com.algorithm.problems.min_cost_climbing_stairs;

class Solution3 implements Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {
        int a = 0;
        int b = 0;
        for (int c : cost) {
            int t = c + Math.min(a, b);
            a = b;
            b = t;
        }
        return Math.min(a, b);
    }
}
