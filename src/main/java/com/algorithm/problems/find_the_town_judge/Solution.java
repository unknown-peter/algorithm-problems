/**
 * Leetcode - find_the_town_judge
 */
package com.algorithm.problems.find_the_town_judge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findJudge(int n, int[][] trust);
}
