/**
 * Leetcode - closest_binary_search_tree_value
 */
package com.algorithm.problems.closest_binary_search_tree_value;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public int closestValue(TreeNode root, double target) {
        TreeNode nextNode = (root.val > target) ? root.left : root.right;
        if (nextNode == null) return root.val;
        int nextValue = closestValue(nextNode, target);
        return (Math.abs(nextValue - target) > Math.abs(root.val - target)) ? root.val : nextValue;
    }
}
