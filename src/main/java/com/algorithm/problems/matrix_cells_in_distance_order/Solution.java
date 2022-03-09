/**
 * Leetcode - matrix_cells_in_distance_order
 */
package com.algorithm.problems.matrix_cells_in_distance_order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter);
}
