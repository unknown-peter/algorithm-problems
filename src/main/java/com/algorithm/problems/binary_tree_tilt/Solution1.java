/**
 * Leetcode - binary_tree_tilt
 */
package com.algorithm.problems.binary_tree_tilt;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    private int tilt = 0;

    @Override
    public int findTilt(TreeNode root) {
        tilt = 0;
        getTilt(root);
        return tilt;
    }

    private void getTilt(TreeNode node) {
        if (node == null) return;
        tilt += Math.abs(sumNode(node.left) - sumNode(node.right));
        getTilt(node.left);
        getTilt(node.right);
    }

    private int sumNode(TreeNode node) {
        if (node == null) return 0;
        int sum = node.val;
        sum += sumNode(node.left);
        sum += sumNode(node.right);
        return sum;
    }
}
