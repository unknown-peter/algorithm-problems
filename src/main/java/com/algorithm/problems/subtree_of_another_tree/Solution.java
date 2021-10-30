/**
 * Leetcode - subtree_of_another_tree
 */
package com.algorithm.problems.subtree_of_another_tree;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isSubtree(TreeNode root, TreeNode subRoot);
}
