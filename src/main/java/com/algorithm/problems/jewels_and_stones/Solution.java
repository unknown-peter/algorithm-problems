/**
 * Leetcode - jewels_and_stones
 */
package com.algorithm.problems.jewels_and_stones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int numJewelsInStones(String jewels, String stones);
}
