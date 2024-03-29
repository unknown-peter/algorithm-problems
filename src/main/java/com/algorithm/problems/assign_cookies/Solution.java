/**
 * Leetcode - assign_cookies
 */
package com.algorithm.problems.assign_cookies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findContentChildren(int[] g, int[] s);
}
