/**
 * Leetcode - longest_substring_without_repeating_characters
 */
package com.algorithm.problems.longest_substring_without_repeating_characters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int lengthOfLongestSubstring(String s);
}
