/**
 * Leetcode - trapping_rain_water
 */
package com.algorithm.problems.trapping_rain_water;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int trap(int[] height);
}
