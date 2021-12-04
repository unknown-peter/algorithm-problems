/**
 * Leetcode - count_binary_substrings
 */
package com.algorithm.problems.count_binary_substrings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int countBinarySubstrings(String s);
}
