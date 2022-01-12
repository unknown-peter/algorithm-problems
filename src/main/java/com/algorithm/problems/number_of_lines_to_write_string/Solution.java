/**
 * Leetcode - number_of_lines_to_write_string
 */
package com.algorithm.problems.number_of_lines_to_write_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] numberOfLines(int[] widths, String s);
}
