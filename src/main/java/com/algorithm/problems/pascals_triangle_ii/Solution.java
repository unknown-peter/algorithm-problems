/**
 * Leetcode - pascals_triangle_2
 */
package com.algorithm.problems.pascals_triangle_ii;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> getRow(int rowIndex);
}
