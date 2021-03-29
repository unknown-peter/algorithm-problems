/**
 * Leetcode - same_tree
 */
package com.algorithm.problems.same_tree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ciaoshen.leetcode.util.TreeNode;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public boolean isSameTree(TreeNode p, TreeNode q);
}
