/**
 * Leetcode - invert_binary_tree
 */
package com.algorithm.problems.invert_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    private Queue<TreeNode> list = new LinkedList<>();

    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        list.add(root);
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                TreeNode node = list.poll();
                TreeNode tmp = node.left;
                node.left = node.right;
                node.right = tmp;
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
            }

        }
        return root;
    }
}
