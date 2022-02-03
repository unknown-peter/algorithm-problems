/**
 * Leetcode - increasing_order_search_tree
 */
package com.algorithm.problems.increasing_order_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    TreeNode increasingBST(TreeNode root);
}
