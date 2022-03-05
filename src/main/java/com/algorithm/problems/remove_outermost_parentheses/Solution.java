/**
 * Leetcode - remove_outermost_parentheses
 */
package com.algorithm.problems.remove_outermost_parentheses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String removeOuterParentheses(String s);
}
