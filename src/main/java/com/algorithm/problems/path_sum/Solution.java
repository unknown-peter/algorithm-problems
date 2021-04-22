/**
 * Leetcode - path_sum
 */
package com.algorithm.problems.path_sum;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean hasPathSum(TreeNode root, int targetSum);
}
