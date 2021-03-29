/**
 * Leetcode - remove_element
 */
package com.algorithm.problems.remove_element;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public int removeElement(int[] nums, int val);
}
