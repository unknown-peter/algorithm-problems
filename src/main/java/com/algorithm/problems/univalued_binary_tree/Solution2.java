/**
 * Leetcode - univalued_binary_tree
 */
package com.algorithm.problems.univalued_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val != value) return false;
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return true;
    }
}
