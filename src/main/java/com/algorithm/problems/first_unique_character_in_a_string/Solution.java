/**
 * Leetcode - first_unique_character_in_a_string
 */
package com.algorithm.problems.first_unique_character_in_a_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int firstUniqChar(String s);
}
