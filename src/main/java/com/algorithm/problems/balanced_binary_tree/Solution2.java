/**
 * Leetcode - balanced_binary_tree
 */
package com.algorithm.problems.balanced_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    /**
     * 计算树高度时，如果不是平衡二叉树或者左右子树不是平衡二叉树直接返回-1，不再计算高度
     */
    @Override
    public boolean isBalanced(TreeNode root) {
        return checkDepth(root) != -1;
    }

    private int checkDepth(TreeNode node) {
        if (node == null) return 0;
        int leftDepth = checkDepth(node.left);
        if (leftDepth == -1) return -1;
        int rightDepth = checkDepth(node.right);
        if (rightDepth == -1) return -1;
        if (Math.abs(rightDepth - leftDepth) > 1) return -1;
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
