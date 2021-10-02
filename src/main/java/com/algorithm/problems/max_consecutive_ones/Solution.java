/**
 * Leetcode - max_consecutive_ones
 */
package com.algorithm.problems.max_consecutive_ones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findMaxConsecutiveOnes(int[] nums);
}
