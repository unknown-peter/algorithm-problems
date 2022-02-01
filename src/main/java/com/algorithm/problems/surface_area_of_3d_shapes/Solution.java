/**
 * Leetcode - surface_area_of_3d_shapes
 */
package com.algorithm.problems.surface_area_of_3d_shapes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int surfaceArea(int[][] grid);
}
