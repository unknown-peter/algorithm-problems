/**
 * Leetcode - license_key_formatting
 */
package com.algorithm.problems.license_key_formatting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String licenseKeyFormatting(String s, int k);
}
