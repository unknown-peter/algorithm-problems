/**
 * Leetcode - distribute_candies
 */
package com.algorithm.problems.distribute_candies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int distributeCandies(int[] candyType);
}
