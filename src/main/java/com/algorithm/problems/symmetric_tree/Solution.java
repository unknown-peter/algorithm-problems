/**
 * Leetcode - symmetric_tree
 */
package com.algorithm.problems.symmetric_tree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ciaoshen.leetcode.util.TreeNode;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean isSymmetric(TreeNode root);
}
