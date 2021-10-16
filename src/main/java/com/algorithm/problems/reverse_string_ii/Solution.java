/**
 * Leetcode - reverse_string_ii
 */
package com.algorithm.problems.reverse_string_ii;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String reverseStr(String s, int k);
}
