/**
 * Leetcode - min_cost_climbing_stairs
 */
package com.algorithm.problems.min_cost_climbing_stairs;

class Solution1 implements Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(minCostClimbingStairs(cost, 0), minCostClimbingStairs(cost, 1));
    }

    private int minCostClimbingStairs(int[] cost, int index) {
        if (index >= cost.length) return 0;
        return cost[index] + Math.min(minCostClimbingStairs(cost, index + 1), minCostClimbingStairs(cost, index + 2));
    }
}
