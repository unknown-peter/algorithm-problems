/**
 * Leetcode - strobogrammatic_number
 */
package com.algorithm.problems.strobogrammatic_number;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isStrobogrammatic(String num);
}
