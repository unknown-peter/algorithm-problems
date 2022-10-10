/**
 * Leetcode - group_anagrams
 */
package com.algorithm.problems.group_anagrams;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<List<String>> groupAnagrams(String[] strs);
}
