/**
 * Leetcode - valid_word_abbreviation
 */
package com.algorithm.problems.valid_word_abbreviation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean validWordAbbreviation(String word, String abbr);
}
