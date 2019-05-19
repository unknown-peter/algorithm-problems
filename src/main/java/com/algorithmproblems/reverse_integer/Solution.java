/**
 * Leetcode - reverse_integer
 */
package com.algorithmproblems.reverse_integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int reverse(int x);
}
