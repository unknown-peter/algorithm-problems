/**
 * Leetcode - design_compressed_string_iterator
 */
package com.algorithm.problems.design_compressed_string_iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String[] stringIteratorOperate(String[] operate, String[][] data);
}
