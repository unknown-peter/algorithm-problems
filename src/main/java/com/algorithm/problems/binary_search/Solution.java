/**
 * Leetcode - binary_search
 */
package com.algorithm.problems.binary_search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int search(int[] nums, int target);
}
