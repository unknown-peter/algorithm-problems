/**
 * Leetcode - most_common_word
 */
package com.algorithm.problems.most_common_word;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String mostCommonWord(String paragraph, String[] banned);
}
