/**
 * Leetcode - is_subsequence
 */
package com.algorithm.problems.is_subsequence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isSubsequence(String s, String t);
}
