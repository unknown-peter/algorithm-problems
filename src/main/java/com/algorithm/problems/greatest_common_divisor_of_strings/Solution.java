/**
 * Leetcode - greatest_common_divisor_of_strings
 */
package com.algorithm.problems.greatest_common_divisor_of_strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String gcdOfStrings(String str1, String str2);
}
