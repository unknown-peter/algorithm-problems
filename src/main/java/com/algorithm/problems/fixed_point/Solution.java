/**
 * Leetcode - fixed_point
 */
package com.algorithm.problems.fixed_point;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int fixedPoint(int[] A);
}
