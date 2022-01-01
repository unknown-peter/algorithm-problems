/**
 * Leetcode - prime_number_of_set_bits_in_binary_representation
 */
package com.algorithm.problems.prime_number_of_set_bits_in_binary_representation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int countPrimeSetBits(int left, int right);
}
