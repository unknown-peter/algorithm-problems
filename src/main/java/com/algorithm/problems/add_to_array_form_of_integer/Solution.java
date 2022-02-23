/**
 * Leetcode - add_to_array_form_of_integer
 */
package com.algorithm.problems.add_to_array_form_of_integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> addToArrayForm(int[] num, int k);
}
