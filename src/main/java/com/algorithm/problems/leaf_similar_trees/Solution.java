/**
 * Leetcode - leaf_similar_trees
 */
package com.algorithm.problems.leaf_similar_trees;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean leafSimilar(TreeNode root1, TreeNode root2);
}
