/**
 * Leetcode - binary_tree_paths
 */
package com.algorithm.problems.binary_tree_paths;

import com.ciaoshen.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<String> binaryTreePaths(TreeNode root);
}
