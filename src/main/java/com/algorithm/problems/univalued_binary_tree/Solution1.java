/**
 * Leetcode - univalued_binary_tree
 */
package com.algorithm.problems.univalued_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public boolean isUnivalTree(TreeNode root) {
        return isSameValTree(root, root.val);
    }

    private boolean isSameValTree(TreeNode node, int value) {
        if (node == null) return true;
        if (node.val != value) return false;
        return isSameValTree(node.left, value) && isSameValTree(node.right, value);
    }
}
