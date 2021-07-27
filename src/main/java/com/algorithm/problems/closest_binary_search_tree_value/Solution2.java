/**
 * Leetcode - closest_binary_search_tree_value
 */
package com.algorithm.problems.closest_binary_search_tree_value;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    @Override
    public int closestValue(TreeNode root, double target) {
        int value = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(value - target)) value = root.val;
            root = (root.val > target) ? root.left : root.right;
        }
        return value;
    }
}
