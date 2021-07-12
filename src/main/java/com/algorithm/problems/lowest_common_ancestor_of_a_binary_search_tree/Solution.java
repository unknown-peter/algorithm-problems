/**
 * Leetcode - lowest_common_ancestor_of_a_binary_search_tree
 */
package com.algorithm.problems.lowest_common_ancestor_of_a_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);
}
