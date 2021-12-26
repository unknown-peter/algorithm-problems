/**
 * Leetcode - min_cost_climbing_stairs
 */
package com.algorithm.problems.min_cost_climbing_stairs;

import java.util.HashMap;
import java.util.Map;

class Solution4 implements Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> map = new HashMap<>();
        return minCost(cost, cost.length, map);
    }

    private int minCost(int[] cost, int i, Map<Integer, Integer> map) {
        if (map.containsKey(i)) return map.get(i);
        if (i < 2) {
            map.put(i, cost[i]);
            return cost[i];
        }
        if (i == cost.length) return Math.min(minCost(cost, i - 1, map), minCost(cost, i - 2, map));
        int tmp = cost[i] + Math.min(minCost(cost, i - 1, map), minCost(cost, i - 2, map));
        map.put(i, tmp);
        return tmp;
    }
}
