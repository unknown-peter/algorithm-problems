/**
 * Leetcode - second_minimum_node_in_a_binary_tree
 */
package com.algorithm.problems.second_minimum_node_in_a_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    @Override
    public int findSecondMinimumValue(TreeNode root) {
        long value = find(root, root.val);
        return (value == Long.MAX_VALUE) ? -1 : (int) value;
    }

    private long find(TreeNode node, int min) {
        if (node == null) return Long.MAX_VALUE;
        if (node.val != min) return node.val;
        return Math.min(find(node.left, min), find(node.right, min));
    }
}
