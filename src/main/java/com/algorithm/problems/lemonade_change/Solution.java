/**
 * Leetcode - lemonade_change
 */
package com.algorithm.problems.lemonade_change;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean lemonadeChange(int[] bills);
}
