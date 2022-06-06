/**
 * Leetcode - letter_combinations_of_a_phone_number
 */
package com.algorithm.problems.letter_combinations_of_a_phone_number;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<String> letterCombinations(String digits);
}
