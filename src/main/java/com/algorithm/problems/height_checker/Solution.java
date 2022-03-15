/**
 * Leetcode - height_checker
 */
package com.algorithm.problems.height_checker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int heightChecker(int[] heights);
}
