/**
 * Leetcode - palindrome_permutation
 */
package com.algorithm.problems.palindrome_permutation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean canPermutePalindrome(String s);
}
