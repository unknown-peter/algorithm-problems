/**
 * Leetcode - two_sum_iv_input_is_a_bst
 */
package com.algorithm.problems.two_sum_iv_input_is_a_bst;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean findTarget(TreeNode root, int k);
}
