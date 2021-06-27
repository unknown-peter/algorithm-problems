/**
 * Leetcode - contains_duplicate_ii
 */
package com.algorithm.problems.contains_duplicate_ii;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean containsNearbyDuplicate(int[] nums, int k);
}
