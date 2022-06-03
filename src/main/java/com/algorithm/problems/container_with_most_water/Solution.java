/**
 * Leetcode - container_with_most_water
 */
package com.algorithm.problems.container_with_most_water;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int maxArea(int[] height);
}
