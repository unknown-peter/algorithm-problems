/**
 * Leetcode - search_insert_position
 */
package com.algorithmproblems.search_insert_position;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int searchInsert(int[] nums, int target);
}
