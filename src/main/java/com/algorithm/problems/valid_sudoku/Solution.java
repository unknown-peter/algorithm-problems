/**
 * Leetcode - valid_sudoku
 */
package com.algorithm.problems.valid_sudoku;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isValidSudoku(char[][] board);
}
