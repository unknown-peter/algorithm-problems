/**
 * Leetcode - range_sum_of_bst
 */
package com.algorithm.problems.range_sum_of_bst;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int rangeSumBST(TreeNode root, int low, int high);
}
