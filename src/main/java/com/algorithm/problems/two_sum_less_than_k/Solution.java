/**
 * Leetcode - two_sum_less_than_k
 */
package com.algorithm.problems.two_sum_less_than_k;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int twoSumLessThanK(int[] A, int K);
}
