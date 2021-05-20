/**
 * Leetcode - majority_element
 */
package com.algorithm.problems.majority_element;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int majorityElement(int[] nums);
}
