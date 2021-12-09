/**
 * Leetcode - degree_of_an_array
 */
package com.algorithm.problems.degree_of_an_array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findShortestSubArray(int[] nums);
}
