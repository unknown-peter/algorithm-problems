/**
 * Leetcode - second_minimum_node_in_a_binary_tree
 */
package com.algorithm.problems.second_minimum_node_in_a_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int findSecondMinimumValue(TreeNode root);
}
