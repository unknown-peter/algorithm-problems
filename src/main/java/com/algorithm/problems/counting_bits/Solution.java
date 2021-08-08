/**
 * Leetcode - counting_bits
 */
package com.algorithm.problems.counting_bits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] countBits(int n);
}
