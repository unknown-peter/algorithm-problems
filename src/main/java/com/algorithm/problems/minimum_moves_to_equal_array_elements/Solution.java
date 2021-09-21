/**
 * Leetcode - minimum_moves_to_equal_array_elements
 */
package com.algorithm.problems.minimum_moves_to_equal_array_elements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int minMoves(int[] nums);
}
