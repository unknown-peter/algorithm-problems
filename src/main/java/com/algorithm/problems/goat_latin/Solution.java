/**
 * Leetcode - goat_latin
 */
package com.algorithm.problems.goat_latin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String toGoatLatin(String sentence);
}
