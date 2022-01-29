/**
 * Leetcode - uncommon_words_from_two_sentences
 */
package com.algorithm.problems.uncommon_words_from_two_sentences;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String[] uncommonFromSentences(String s1, String s2);
}
