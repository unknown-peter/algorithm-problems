/**
 * Leetcode - ransom_note
 */
package com.algorithm.problems.ransom_note;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean canConstruct(String ransomNote, String magazine);
}
