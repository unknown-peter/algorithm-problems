/**
 * Leetcode - flood_fill
 */
package com.algorithm.problems.flood_fill;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[][] floodFill(int[][] image, int sr, int sc, int newColor);
}
