/**
 * Leetcode - first_missing_positive
 */
package com.algorithm.problems.first_missing_positive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int firstMissingPositive(int[] nums);
}
