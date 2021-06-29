/**
 * Leetcode - invert_binary_tree
 */
package com.algorithm.problems.invert_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.right = left;
        root.left = right;
        return root;
    }
}
