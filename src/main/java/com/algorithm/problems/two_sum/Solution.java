/**
 * Leetcode - two_sum
 */
package com.algorithm.problems.two_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int[] twoSum(int[] nums, int target);
}
