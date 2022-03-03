/**
 * Leetcode - binary_prefix_divisible_by_5
 */
package com.algorithm.problems.binary_prefix_divisible_by_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Boolean> prefixesDivBy5(int[] nums);
}
