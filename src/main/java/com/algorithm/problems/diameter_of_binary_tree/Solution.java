/**
 * Leetcode - diameter_of_binary_tree
 */
package com.algorithm.problems.diameter_of_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int diameterOfBinaryTree(TreeNode root);
}
