/**
 * Leetcode - convert_a_number_to_hexadecimal
 */
package com.algorithm.problems.convert_a_number_to_hexadecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String toHex(int num);
}
