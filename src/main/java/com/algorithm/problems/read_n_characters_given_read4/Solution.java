/**
 * Leetcode - read_n_characters_given_read4
 */
package com.algorithm.problems.read_n_characters_given_read4;

import com.algorithm.util.FileOperateClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    void setFile(FileOperateClass file);

    int read(char[] buf, int n);
}
