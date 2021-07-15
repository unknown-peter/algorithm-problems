/**
 * Leetcode - shortest_word_distance
 */
package com.algorithm.problems.shortest_word_distance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int shortestDistance(String[] words, String word1, String word2);
}
