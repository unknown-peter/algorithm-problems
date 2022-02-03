/**
 * Leetcode - increasing_order_search_tree
 */
package com.algorithm.problems.increasing_order_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Stack;

class Solution1 implements Solution {

    @Override
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode resHead = new TreeNode(-1);
        TreeNode resNode = resHead;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            resNode.right = new TreeNode(node.val);
            resNode = resNode.right;
            node = node.right;
        }
        return resHead.right;
    }
}
