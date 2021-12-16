/**
 * Leetcode - binary_tree_maximum_path_sum
 */
package com.algorithm.problems.binary_tree_maximum_path_sum;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    private int maxSum = Integer.MIN_VALUE;

    @Override
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        getMaxPathSum(root);
        return maxSum;
    }

    private int getMaxPathSum(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(getMaxPathSum(node.left), 0);
        int right = Math.max(getMaxPathSum(node.right), 0);
        maxSum = Math.max(maxSum, left + node.val + right);
        return node.val + Math.max(left, right);
    }
}
