/**
 * Leetcode - delete_columns_to_make_sorted
 */
package com.algorithm.problems.delete_columns_to_make_sorted;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int minDeletionSize(String[] strs);
}
