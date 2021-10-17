/**
 * Leetcode - diameter_of_binary_tree
 */
package com.algorithm.problems.diameter_of_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return Math.max(treeHeight(root.left) + treeHeight(root.right),
                Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }

    private int treeHeight(TreeNode node) {
        if (node == null) return 0;
        return Math.max(treeHeight(node.left), treeHeight(node.right)) + 1;
    }
}
