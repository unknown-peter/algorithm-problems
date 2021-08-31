/**
 * Leetcode - sum_of_left_leaves
 */
package com.algorithm.problems.sum_of_left_leaves;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int sumOfLeftLeaves(TreeNode root);
}
