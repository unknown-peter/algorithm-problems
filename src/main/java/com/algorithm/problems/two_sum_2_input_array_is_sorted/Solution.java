/**
 * Leetcode - two_sum_2_input_array_is_sorted
 */
package com.algorithm.problems.two_sum_2_input_array_is_sorted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] twoSum(int[] numbers, int target);
}
