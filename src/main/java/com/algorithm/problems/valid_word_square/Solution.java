/**
 * Leetcode - valid_word_square
 */
package com.algorithm.problems.valid_word_square;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean validWordSquare(List<String> words);
}
