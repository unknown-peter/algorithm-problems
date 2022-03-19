/**
 * Leetcode - sum_of_digits_in_the_minimum_number
 */
package com.algorithm.problems.sum_of_digits_in_the_minimum_number;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int sumOfDigits(int[] A);
}
