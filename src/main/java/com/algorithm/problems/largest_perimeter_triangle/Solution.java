/**
 * Leetcode - largest_perimeter_triangle
 */
package com.algorithm.problems.largest_perimeter_triangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int largestPerimeter(int[] nums);
}
