/**
 * Leetcode - occurrences_after_bigram
 */
package com.algorithm.problems.occurrences_after_bigram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String[] findOcurrences(String text, String first, String second);
}
