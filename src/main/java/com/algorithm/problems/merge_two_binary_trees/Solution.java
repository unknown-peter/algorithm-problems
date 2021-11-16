/**
 * Leetcode - merge_two_binary_trees
 */
package com.algorithm.problems.merge_two_binary_trees;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    TreeNode mergeTrees(TreeNode root1, TreeNode root2);
}
