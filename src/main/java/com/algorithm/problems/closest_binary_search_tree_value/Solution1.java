/**
 * Leetcode - closest_binary_search_tree_value
 */
package com.algorithm.problems.closest_binary_search_tree_value;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public int closestValue(TreeNode root, double target) {
        if (root == null) return Integer.MIN_VALUE;

        int val;
        double parentDistance = Math.abs(root.val - target);
        if (root.val > target) val = closestValue(root.left, target);
        else val = closestValue(root.right, target);
        return (Math.abs(val - target) > parentDistance) ? root.val : val;
    }
}
