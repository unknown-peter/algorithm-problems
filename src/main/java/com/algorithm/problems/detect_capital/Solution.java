/**
 * Leetcode - detect_capital
 */
package com.algorithm.problems.detect_capital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean detectCapitalUse(String word);
}
