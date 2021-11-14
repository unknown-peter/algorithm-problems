/**
 * Leetcode - construct_string_from_binary_tree
 */
package com.algorithm.problems.construct_string_from_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    private StringBuilder sb = new StringBuilder();

    @Override
    public String tree2str(TreeNode root) {
        sb = new StringBuilder();
        node2str(root);
        return sb.toString();
    }

    private void node2str(TreeNode node) {
        if (node == null) return;
        sb.append(node.val);
        if (node.left == null && node.right == null) return;
        sb.append('(');
        if (node.left != null) node2str(node.left);
        sb.append(')');
        if (node.right != null) {
            sb.append('(');
            node2str(node.right);
            sb.append(')');
        }
    }
}
