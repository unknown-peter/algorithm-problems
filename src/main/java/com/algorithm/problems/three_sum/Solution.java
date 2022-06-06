/**
 * Leetcode - three_sum
 */
package com.algorithm.problems.three_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<List<Integer>> threeSum(int[] nums);
}
