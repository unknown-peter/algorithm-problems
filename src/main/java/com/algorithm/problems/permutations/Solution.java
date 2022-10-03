/**
 * Leetcode - permutations
 */
package com.algorithm.problems.permutations;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<List<Integer>> permute(int[] nums);
}
