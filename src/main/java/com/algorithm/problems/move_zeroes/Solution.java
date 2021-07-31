/**
 * Leetcode - move_zeroes
 */
package com.algorithm.problems.move_zeroes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    void moveZeroes(int[] nums);
}
