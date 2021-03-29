/**
 * Leetcode - longest_common_prefix
 */
package com.algorithm.problems.longest_common_prefix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public String longestCommonPrefix(String[] strs);
}
