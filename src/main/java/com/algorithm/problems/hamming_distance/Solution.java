/**
 * Leetcode - hamming_distance
 */
package com.algorithm.problems.hamming_distance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int hammingDistance(int x, int y);
}
