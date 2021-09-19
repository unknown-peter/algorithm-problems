/**
 * Leetcode - find_all_numbers_disappeared_in_an_array
 */
package com.algorithm.problems.find_all_numbers_disappeared_in_an_array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> findDisappearedNumbers(int[] nums);
}
