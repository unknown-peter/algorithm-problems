/**
 * Leetcode - positions_of_large_groups
 */
package com.algorithm.problems.positions_of_large_groups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<List<Integer>> largeGroupPositions(String s);
}
