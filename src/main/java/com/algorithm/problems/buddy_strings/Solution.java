/**
 * Leetcode - buddy_strings
 */
package com.algorithm.problems.buddy_strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean buddyStrings(String s, String goal);
}
