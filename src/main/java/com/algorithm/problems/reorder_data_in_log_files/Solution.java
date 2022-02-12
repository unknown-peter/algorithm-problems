/**
 * Leetcode - reorder_data_in_log_files
 */
package com.algorithm.problems.reorder_data_in_log_files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String[] reorderLogFiles(String[] logs);
}
