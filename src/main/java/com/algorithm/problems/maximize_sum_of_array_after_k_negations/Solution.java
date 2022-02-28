/**
 * Leetcode - maximize_sum_of_array_after_k_negations
 */
package com.algorithm.problems.maximize_sum_of_array_after_k_negations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int largestSumAfterKNegations(int[] nums, int k);
}
