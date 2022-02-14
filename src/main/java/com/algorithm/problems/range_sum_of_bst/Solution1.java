/**
 * Leetcode - range_sum_of_bst
 */
package com.algorithm.problems.range_sum_of_bst;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    private int sum = 0;

    @Override
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        sum(root, low, high);
        return sum;
    }

    private void sum(TreeNode node, int low, int high) {
        if (node == null) return;
        if (node.val < low) sum(node.right, low, high);
        else if (node.val > high) sum(node.left, low, high);
        else {
            sum += node.val;
            sum(node.left, low, high);
            sum(node.right, low, high);
        }
    }
}
