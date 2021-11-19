/**
 * Leetcode - average_of_levels_in_binary_tree
 */
package com.algorithm.problems.average_of_levels_in_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Double> averageOfLevels(TreeNode root);
}
