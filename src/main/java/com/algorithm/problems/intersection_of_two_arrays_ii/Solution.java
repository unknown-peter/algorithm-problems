/**
 * Leetcode - intersection_of_two_arrays_ii
 */
package com.algorithm.problems.intersection_of_two_arrays_ii;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] intersect(int[] nums1, int[] nums2);
}
