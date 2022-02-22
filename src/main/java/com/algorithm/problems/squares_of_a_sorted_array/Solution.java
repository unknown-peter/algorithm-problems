/**
 * Leetcode - squares_of_a_sorted_array
 */
package com.algorithm.problems.squares_of_a_sorted_array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] sortedSquares(int[] nums);
}
