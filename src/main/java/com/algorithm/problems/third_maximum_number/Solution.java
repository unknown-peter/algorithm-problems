/**
 * Leetcode - third_maximum_number
 */
package com.algorithm.problems.third_maximum_number;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int thirdMax(int[] nums);
}
