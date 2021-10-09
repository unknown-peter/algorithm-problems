/**
 * Leetcode - base_7
 */
package com.algorithm.problems.base_7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String convertToBase7(int num);
}
