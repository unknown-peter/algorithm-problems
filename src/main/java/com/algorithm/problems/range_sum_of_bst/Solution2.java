/**
 * Leetcode - range_sum_of_bst
 */
package com.algorithm.problems.range_sum_of_bst;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val < low) {
                if (node.right != null) stack.push(node.right);
            } else if (node.val > high) {
                if (node.left != null) stack.push(node.left);
            } else {
                sum += node.val;
                if (node.left != null) stack.push(node.left);
                if (node.right != null) stack.push(node.right);
            }
        }
        return sum;
    }
}
