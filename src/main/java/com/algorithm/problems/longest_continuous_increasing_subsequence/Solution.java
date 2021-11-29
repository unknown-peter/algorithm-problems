/**
 * Leetcode - longest_continuous_increasing_subsequence
 */
package com.algorithm.problems.longest_continuous_increasing_subsequence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findLengthOfLCIS(int[] nums);
}
