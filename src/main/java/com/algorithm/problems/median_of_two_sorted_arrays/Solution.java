/**
 * Leetcode - median_of_two_sorted_arrays
 */
package com.algorithm.problems.median_of_two_sorted_arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    double findMedianSortedArrays(int[] nums1, int[] nums2);
}
