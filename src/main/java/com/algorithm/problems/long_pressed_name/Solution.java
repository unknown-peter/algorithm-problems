/**
 * Leetcode - long_pressed_name
 */
package com.algorithm.problems.long_pressed_name;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isLongPressedName(String name, String typed);
}
