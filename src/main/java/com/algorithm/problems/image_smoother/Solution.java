/**
 * Leetcode - image_smoother
 */
package com.algorithm.problems.image_smoother;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[][] imageSmoother(int[][] img);
}
