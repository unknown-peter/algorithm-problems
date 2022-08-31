/**
 * Leetcode - find_first_and_last_position_of_element_in_sorted_array
 */
package com.algorithm.problems.find_first_and_last_position_of_element_in_sorted_array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] searchRange(int[] nums, int target);
}
