/**
 * Leetcode - fizz_buzz
 */
package com.algorithm.problems.fizz_buzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<String> fizzBuzz(int n);
}
