/**
 * Leetcode - sum_of_root_to_leaf_binary_numbers
 */
package com.algorithm.problems.sum_of_root_to_leaf_binary_numbers;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    private int sum = 0;

    @Override
    public int sumRootToLeaf(TreeNode root) {
        sumNode(root, 0);
        return sum;
    }

    private void sumNode(TreeNode node, int val) {
        int curSum = (val << 1) + node.val;

        if (node.left == null && node.right == null) {
            sum += curSum;
            return;
        }
        if (node.left != null) {
            sumNode(node.left, curSum);
        }
        if (node.right != null) {
            sumNode(node.right, curSum);
        }
    }
}
