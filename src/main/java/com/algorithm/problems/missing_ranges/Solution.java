/**
 * Leetcode - missing_ranges
 */
package com.algorithm.problems.missing_ranges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<String> findMissingRanges(int[] nums, int lower, int upper);
}
