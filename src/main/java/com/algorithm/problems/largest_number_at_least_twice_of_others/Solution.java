/**
 * Leetcode - largest_number_at_least_twice_of_others
 */
package com.algorithm.problems.largest_number_at_least_twice_of_others;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int dominantIndex(int[] nums);
}
