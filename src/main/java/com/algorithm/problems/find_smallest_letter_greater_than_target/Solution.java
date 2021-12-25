/**
 * Leetcode - find_smallest_letter_greater_than_target
 */
package com.algorithm.problems.find_smallest_letter_greater_than_target;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    char nextGreatestLetter(char[] letters, char target);
}
