/**
 * Leetcode - index_pairs_of_a_string
 */
package com.algorithm.problems.index_pairs_of_a_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[][] indexPairs(String text, String[] words);
}
