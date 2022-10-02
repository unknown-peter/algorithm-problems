/**
 * Leetcode - wildcard_matching
 */
package com.algorithm.problems.wildcard_matching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isMatch(String s, String p);
}
