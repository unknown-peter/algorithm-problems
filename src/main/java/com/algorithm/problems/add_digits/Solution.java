/**
 * Leetcode - add_digits
 */
package com.algorithm.problems.add_digits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int addDigits(int num);
}
