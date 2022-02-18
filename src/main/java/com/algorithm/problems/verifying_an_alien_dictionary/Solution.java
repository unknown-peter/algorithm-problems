/**
 * Leetcode - verifying_an_alien_dictionary
 */
package com.algorithm.problems.verifying_an_alien_dictionary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isAlienSorted(String[] words, String order);
}
