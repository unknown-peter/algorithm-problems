/**
 * Leetcode - merge_two_binary_trees
 */
package com.algorithm.problems.merge_two_binary_trees;

import com.ciaoshen.leetcode.util.TreeNode;
import org.apache.commons.lang3.tuple.Triple;

import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode node = new TreeNode(root1.val + root2.val);
        Stack<Triple<TreeNode, TreeNode, TreeNode>> stack = new Stack<>();
        stack.push(Triple.of(root1, root2, node));
        while (!stack.isEmpty()) {
            Triple<TreeNode, TreeNode, TreeNode> nodeTriple = stack.pop();
            TreeNode root1Left = null;
            TreeNode root2Left = null;
            TreeNode nodeLeft = new TreeNode(0);

            if (nodeTriple.getLeft() != null && nodeTriple.getLeft().left != null) {
                nodeLeft.val += nodeTriple.getLeft().left.val;
                root1Left = nodeTriple.getLeft().left;
            }
            if (nodeTriple.getMiddle() != null && nodeTriple.getMiddle().left != null) {
                nodeLeft.val += nodeTriple.getMiddle().left.val;
                root2Left = nodeTriple.getMiddle().left;
            }
            if (root1Left != null || root2Left != null) {
                nodeTriple.getRight().left = nodeLeft;
                stack.push(Triple.of(root1Left, root2Left, nodeLeft));
            }

            TreeNode root1Right = null;
            TreeNode root2Right = null;
            TreeNode nodeRight = new TreeNode(0);

            if (nodeTriple.getLeft() != null && nodeTriple.getLeft().right != null) {
                nodeRight.val += nodeTriple.getLeft().right.val;
                root1Right = nodeTriple.getLeft().right;
            }
            if (nodeTriple.getMiddle() != null && nodeTriple.getMiddle().right != null) {
                nodeRight.val += nodeTriple.getMiddle().right.val;
                root2Right = nodeTriple.getMiddle().right;
            }
            if (root1Right != null || root2Right != null) {
                nodeTriple.getRight().right = nodeRight;
                stack.push(Triple.of(root1Right, root2Right, nodeRight));
            }
        }
        return node;
    }
}
