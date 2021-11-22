/**
 * Leetcode - set_mismatch
 */
package com.algorithm.problems.set_mismatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] findErrorNums(int[] nums);
}
