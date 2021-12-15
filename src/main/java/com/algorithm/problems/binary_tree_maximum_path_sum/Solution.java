/**
 * Leetcode - binary_tree_maximum_path_sum
 */
package com.algorithm.problems.binary_tree_maximum_path_sum;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int maxPathSum(TreeNode root);
}
