/**
 * Leetcode - teemo_attacking
 */
package com.algorithm.problems.teemo_attacking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findPoisonedDuration(int[] timeSeries, int duration);
}
