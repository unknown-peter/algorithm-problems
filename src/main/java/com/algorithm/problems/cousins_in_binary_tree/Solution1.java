/**
 * Leetcode - cousins_in_binary_tree
 */
package com.algorithm.problems.cousins_in_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Objects;

class Solution1 implements Solution {

    TreeNode xParent;

    TreeNode yParent;

    int xDepth;

    int yDepth;

    @Override
    public boolean isCousins(TreeNode root, int x, int y) {
        xParent = null;
        yParent = null;
        xDepth = -1;
        yDepth = -1;

        if (x == root.val || y == root.val) return false;

        findNode(root, x, y, 0, null);
        return xDepth == yDepth && !Objects.equals(xParent, yParent);
    }

    private void findNode(TreeNode node, int x, int y, int depth, TreeNode parent) {
        if (node == null) return;

        if (node.val == x) {
            xDepth = depth;
            xParent = parent;
        } else if (node.val == y) {
            yDepth = depth;
            yParent = parent;
        }
        findNode(node.left, x, y, depth + 1, node);
        findNode(node.right, x, y, depth + 1, node);
    }
}
