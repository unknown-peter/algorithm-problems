/**
 * Leetcode - four_sum
 */
package com.algorithm.problems.four_sum;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<List<Integer>> fourSum(int[] nums, int target);
}
