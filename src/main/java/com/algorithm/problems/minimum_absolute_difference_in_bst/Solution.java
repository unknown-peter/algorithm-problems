/**
 * Leetcode - minimum_absolute_difference_in_bst
 */
package com.algorithm.problems.minimum_absolute_difference_in_bst;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int getMinimumDifference(TreeNode root);
}
