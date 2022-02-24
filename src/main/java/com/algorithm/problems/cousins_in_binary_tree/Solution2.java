/**
 * Leetcode - cousins_in_binary_tree
 */
package com.algorithm.problems.cousins_in_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    @Override
    public boolean isCousins(TreeNode root, int x, int y) {
        if (x == root.val || y == root.val) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            boolean xFound = false;
            boolean yFound = false;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node.left != null && node.right != null) {
                    if (node.left.val == x && node.right.val == y) return false;
                    if (node.left.val == y && node.right.val == x) return false;
                }
                if (node.left != null) {
                    queue.add(node.left);
                    if (node.left.val == x) xFound = true;
                    else if (node.left.val == y) yFound = true;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    if (node.right.val == x) xFound = true;
                    else if (node.right.val == y) yFound = true;
                }
                if (xFound && yFound) return true;
            }
            if (xFound ^ yFound) return false;
        }
        return false;
    }
}
