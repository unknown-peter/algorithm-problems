/**
 * Leetcode - sort_array_by_parity
 */
package com.algorithm.problems.sort_array_by_parity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] sortArrayByParity(int[] nums);
}
