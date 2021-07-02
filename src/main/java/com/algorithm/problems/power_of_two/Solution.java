/**
 * Leetcode - power_of_two
 */
package com.algorithm.problems.power_of_two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isPowerOfTwo(int n);
}
