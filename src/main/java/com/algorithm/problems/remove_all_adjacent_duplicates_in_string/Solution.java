/**
 * Leetcode - remove_all_adjacent_duplicates_in_string
 */
package com.algorithm.problems.remove_all_adjacent_duplicates_in_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String removeDuplicates(String s);
}
