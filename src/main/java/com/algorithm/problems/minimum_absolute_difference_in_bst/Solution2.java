/**
 * Leetcode - minimum_absolute_difference_in_bst
 */
package com.algorithm.problems.minimum_absolute_difference_in_bst;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode nodeLeft = node.left;
            TreeNode nodeRight = node.right;
            if (nodeLeft != null) stack.push(nodeLeft);
            if (nodeRight != null) stack.push(nodeRight);

            while (nodeLeft != null) {
                min = Math.min(min, node.val - nodeLeft.val);
                nodeLeft = nodeLeft.right;
            }
            while (nodeRight != null) {
                min = Math.min(min, nodeRight.val - node.val);
                nodeRight = nodeRight.left;
            }
        }
        return min;
    }
}
