/**
 * Leetcode - implement_strStr
 */
package com.algorithmproblems.implement_strStr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int strStr(String haystack, String needle);
}
