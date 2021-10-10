/**
 * Leetcode - relative_ranks
 */
package com.algorithm.problems.relative_ranks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String[] findRelativeRanks(int[] score);
}
