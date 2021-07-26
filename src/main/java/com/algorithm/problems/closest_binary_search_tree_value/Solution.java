/**
 * Leetcode - closest_binary_search_tree_value
 */
package com.algorithm.problems.closest_binary_search_tree_value;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int closestValue(TreeNode root, double target);
}
