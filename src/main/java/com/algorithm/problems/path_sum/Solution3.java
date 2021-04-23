/**
 * Leetcode - path_sum
 */
package com.algorithm.problems.path_sum;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Stack;

class Solution3 implements Solution {

    @Override
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left == null && node.right == null && node.val == targetSum) return true;
            if (node.left != null) {
                node.left.val += node.val;
                stack.push(node.left);
            }
            if (node.right != null) {
                node.right.val += node.val;
                stack.push(node.right);
            }
        }
        return false;
    }
}
