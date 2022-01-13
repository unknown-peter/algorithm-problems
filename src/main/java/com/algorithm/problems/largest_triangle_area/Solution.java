/**
 * Leetcode - largest_triangle_area
 */
package com.algorithm.problems.largest_triangle_area;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    double largestTriangleArea(int[][] points);
}
