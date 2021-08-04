/**
 * Leetcode - word_pattern
 */
package com.algorithm.problems.word_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean wordPattern(String pattern, String s);
}
