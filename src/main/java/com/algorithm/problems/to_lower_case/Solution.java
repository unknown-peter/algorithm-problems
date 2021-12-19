/**
 * Leetcode - to_lower_case
 */
package com.algorithm.problems.to_lower_case;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String toLowerCase(String s);
}
