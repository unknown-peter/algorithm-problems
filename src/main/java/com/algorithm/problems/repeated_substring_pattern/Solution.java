/**
 * Leetcode - repeated_substring_pattern
 */
package com.algorithm.problems.repeated_substring_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean repeatedSubstringPattern(String s);
}
