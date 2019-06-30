/**
 * Leetcode - add_binary
 */
package com.algorithmproblems.add_binary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public String addBinary(String a, String b);
}
