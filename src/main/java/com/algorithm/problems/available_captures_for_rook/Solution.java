/**
 * Leetcode - available_captures_for_rook
 */
package com.algorithm.problems.available_captures_for_rook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int numRookCaptures(char[][] board);
}
