/**
 * Leetcode - divide_two_integers
 */
package com.algorithm.problems.divide_two_integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int divide(int dividend, int divisor);
}
