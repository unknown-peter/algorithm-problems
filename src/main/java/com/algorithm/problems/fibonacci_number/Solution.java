/**
 * Leetcode - fibonacci_number
 */
package com.algorithm.problems.fibonacci_number;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int fib(int n);
}
