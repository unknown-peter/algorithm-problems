/**
 * Leetcode - longest_uncommon_subsequence_i
 */
package com.algorithm.problems.longest_uncommon_subsequence_i;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findLUSlength(String a, String b);
}
