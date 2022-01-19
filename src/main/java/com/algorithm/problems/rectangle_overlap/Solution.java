/**
 * Leetcode - rectangle_overlap
 */
package com.algorithm.problems.rectangle_overlap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isRectangleOverlap(int[] rec1, int[] rec2);
}
