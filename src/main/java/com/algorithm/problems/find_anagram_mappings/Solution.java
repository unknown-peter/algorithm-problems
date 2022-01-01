/**
 * Leetcode - find_anagram_mappings
 */
package com.algorithm.problems.find_anagram_mappings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] anagramMappings(int[] A, int[] B);
}
