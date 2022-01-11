/**
 * Leetcode - unique_morse_code_words
 */
package com.algorithm.problems.unique_morse_code_words;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int uniqueMorseRepresentations(String[] words);
}
