/**
 * Leetcode - longest_palindromic_substring
 */
package com.algorithm.problems.longest_palindromic_substring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String longestPalindrome(String s);
}
