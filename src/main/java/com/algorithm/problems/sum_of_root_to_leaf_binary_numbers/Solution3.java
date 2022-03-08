/**
 * Leetcode - sum_of_root_to_leaf_binary_numbers
 */
package com.algorithm.problems.sum_of_root_to_leaf_binary_numbers;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     * Morris前序遍历
     * 对二叉树从root左节点开始向下遍历其右节点直到右节点为null或为当前root
     * 如果右节点为null，则设置右节点为当前root；如果右节点已经为当前root了，则说明当前root左边已遍历完，重置右节点为null并转向当前root右节点
     * 过程中逐层计算currNumber，转向右节点时右移回退currNumber
     */
    @Override
    public int sumRootToLeaf(TreeNode root) {
        int rootToLeaf = 0, currNumber = 0;
        int steps;
        TreeNode predecessor;

        while (root != null) {
            // If there is a left child,
            // then compute the predecessor.
            // If there is no link predecessor.right = root --> set it.
            // If there is a link predecessor.right = root --> break it.
            if (root.left != null) {
                // Predecessor node is one step to the left
                // and then to the right till you can.
                predecessor = root.left;
                steps = 1;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                    ++steps;
                }

                // Set link predecessor.right = root
                // and go to explore the left subtree
                if (predecessor.right == null) {
                    currNumber = (currNumber << 1) | root.val;
                    predecessor.right = root;
                    root = root.left;
                }
                // Break the link predecessor.right = root
                // Once the link is broken,
                // it's time to change subtree and go to the right
                else {
                    // If you're on the leaf, update the sum
                    if (predecessor.left == null) {
                        rootToLeaf += currNumber;
                    }
                    // This part of tree is explored, backtrack
                    for (int i = 0; i < steps; ++i) {
                        currNumber >>= 1;
                    }
                    predecessor.right = null;
                    root = root.right;
                }
            }
            // If there is no left child
            // then just go right.
            else {
                currNumber = (currNumber << 1) | root.val;
                // if you're on the leaf, update the sum
                if (root.right == null) {
                    rootToLeaf += currNumber;
                }
                root = root.right;
            }
        }
        return rootToLeaf;
    }
}
