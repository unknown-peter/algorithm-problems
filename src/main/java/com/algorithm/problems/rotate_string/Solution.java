/**
 * Leetcode - rotate_string
 */
package com.algorithm.problems.rotate_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean rotateString(String s, String goal);
}
