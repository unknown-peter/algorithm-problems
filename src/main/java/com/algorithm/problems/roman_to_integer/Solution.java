/**
 * Leetcode - roman_to_integer
 */
package com.algorithm.problems.roman_to_integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int romanToInt(String s);
}
