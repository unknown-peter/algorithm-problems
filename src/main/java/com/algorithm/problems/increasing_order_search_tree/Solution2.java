/**
 * Leetcode - increasing_order_search_tree
 */
package com.algorithm.problems.increasing_order_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    private TreeNode head = new TreeNode(-1);

    private TreeNode resNode = head;

    @Override
    public TreeNode increasingBST(TreeNode root) {
        genResult(root);
        return head.right;
    }

    private void genResult(TreeNode node) {
        if (node == null) return;
        genResult(node.left);
        resNode.right = new TreeNode(node.val);
        resNode = resNode.right;
        genResult(node.right);
    }
}
