/**
 * Leetcode - three_sum_closest
 */
package com.algorithm.problems.three_sum_closest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int threeSumClosest(int[] nums, int target);
}
