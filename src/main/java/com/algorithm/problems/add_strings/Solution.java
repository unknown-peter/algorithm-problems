/**
 * Leetcode - add_strings
 */
package com.algorithm.problems.add_strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String addStrings(String num1, String num2);
}
