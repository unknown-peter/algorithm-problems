/**
 * Leetcode - partition_array_into_three_parts_with_equal_sum
 */
package com.algorithm.problems.partition_array_into_three_parts_with_equal_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean canThreePartsEqualSum(int[] arr);
}
