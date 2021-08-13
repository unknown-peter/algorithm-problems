/**
 * Leetcode - logger_rate_limiter
 */
package com.algorithm.problems.logger_rate_limiter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Boolean[] loggerOperate(String[] operate, String[][] data);
}
