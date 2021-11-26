/**
 * Leetcode - robot_return_to_origin
 */
package com.algorithm.problems.robot_return_to_origin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean judgeCircle(String moves);
}
