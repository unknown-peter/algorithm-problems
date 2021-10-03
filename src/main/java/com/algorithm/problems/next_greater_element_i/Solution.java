/**
 * Leetcode - next_greater_element_i
 */
package com.algorithm.problems.next_greater_element_i;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] nextGreaterElement(int[] nums1, int[] nums2);
}
