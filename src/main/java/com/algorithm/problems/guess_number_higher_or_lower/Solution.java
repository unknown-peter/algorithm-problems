/**
 * Leetcode - guess_number_higher_or_lower
 */
package com.algorithm.problems.guess_number_higher_or_lower;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    void setPick(int pick);

    int guessNumber(int n);
}
