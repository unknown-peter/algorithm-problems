/**
 * Leetcode - minimum_absolute_difference_in_bst
 */
package com.algorithm.problems.minimum_absolute_difference_in_bst;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution3 implements Solution {

    private TreeNode pre = null;

    private int min = Integer.MAX_VALUE;

    /**
     * 由于二叉搜索树性质，通过中序遍历二叉搜索树可以得到一个有序数组，最小绝对差值一定在相邻的两个值之间
     * 因此中序遍历改树并计算当前节点和上一个节点的差值
     */
    @Override
    public int getMinimumDifference(TreeNode root) {
        pre = null;
        min = Integer.MAX_VALUE;

        calcMinimumDifference(root);
        return min;
    }

    private void calcMinimumDifference(TreeNode node) {
        if (node == null) return;

        calcMinimumDifference(node.left);
        if (pre != null) min = Math.min(min, node.val - pre.val);
        pre = node;
        calcMinimumDifference(node.right);
    }
}
