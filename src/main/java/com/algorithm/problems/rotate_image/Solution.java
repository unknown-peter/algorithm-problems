/**
 * Leetcode - rotate_image
 */
package com.algorithm.problems.rotate_image;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    void rotate(int[][] matrix);
}
