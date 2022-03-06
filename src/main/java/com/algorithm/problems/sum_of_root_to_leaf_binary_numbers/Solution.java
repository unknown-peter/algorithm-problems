/**
 * Leetcode - sum_of_root_to_leaf_binary_numbers
 */
package com.algorithm.problems.sum_of_root_to_leaf_binary_numbers;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int sumRootToLeaf(TreeNode root);
}
