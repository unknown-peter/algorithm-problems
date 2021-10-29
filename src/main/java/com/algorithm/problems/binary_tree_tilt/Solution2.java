/**
 * Leetcode - binary_tree_tilt
 */
package com.algorithm.problems.binary_tree_tilt;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    private int tilt = 0;

    @Override
    public int findTilt(TreeNode root) {
        tilt = 0;
        calcTilt(root);
        return tilt;
    }

    private int calcTilt(TreeNode node) {
        if (node == null) return 0;
        int left = calcTilt(node.left);
        int right = calcTilt(node.right);
        tilt += Math.abs(right - left);
        return left + node.val + right;
    }
}
