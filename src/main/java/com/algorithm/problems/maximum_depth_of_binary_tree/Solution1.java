/**
 * Leetcode - maximum_depth_of_binary_tree
 */
package com.algorithm.problems.maximum_depth_of_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
