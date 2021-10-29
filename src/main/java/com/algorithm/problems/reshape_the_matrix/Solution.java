/**
 * Leetcode - reshape_the_matrix
 */
package com.algorithm.problems.reshape_the_matrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[][] matrixReshape(int[][] mat, int r, int c);
}
