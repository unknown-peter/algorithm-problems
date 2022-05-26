/**
 * Leetcode - zigzag_conversion
 */
package com.algorithm.problems.zigzag_conversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String convert(String s, int numRows);
}
