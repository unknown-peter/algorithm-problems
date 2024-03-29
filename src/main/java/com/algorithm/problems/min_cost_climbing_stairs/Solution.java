/**
 * Leetcode - min_cost_climbing_stairs
 */
package com.algorithm.problems.min_cost_climbing_stairs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int minCostClimbingStairs(int[] cost);
}
