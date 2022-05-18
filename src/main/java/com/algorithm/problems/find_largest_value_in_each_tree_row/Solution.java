/**
 * Leetcode - find_largest_value_in_each_tree_row
 */
package com.algorithm.problems.find_largest_value_in_each_tree_row;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> largestValues(TreeNode root);
}
