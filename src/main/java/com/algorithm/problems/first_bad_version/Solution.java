/**
 * Leetcode - first_bad_version
 */
package com.algorithm.problems.first_bad_version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    void setBadVersion(int badVersion);

    int firstBadVersion(int n);
}
