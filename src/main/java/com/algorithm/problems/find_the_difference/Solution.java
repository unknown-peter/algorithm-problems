/**
 * Leetcode - find_the_difference
 */
package com.algorithm.problems.find_the_difference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    char findTheDifference(String s, String t);
}
