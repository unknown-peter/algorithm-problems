/**
 * Leetcode - distribute_candies_to_people
 */
package com.algorithm.problems.distribute_candies_to_people;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] distributeCandies(int candies, int num_people);
}
