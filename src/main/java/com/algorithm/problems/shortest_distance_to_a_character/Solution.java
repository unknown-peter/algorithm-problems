/**
 * Leetcode - shortest_distance_to_a_character
 */
package com.algorithm.problems.shortest_distance_to_a_character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] shortestToChar(String s, char c);
}
