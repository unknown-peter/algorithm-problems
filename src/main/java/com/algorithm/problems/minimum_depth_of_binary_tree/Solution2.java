/**
 * Leetcode - minimum_depth_of_binary_tree
 */
package com.algorithm.problems.minimum_depth_of_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    /**
     * 遍历二叉树节点，记录遍历层数，到叶子结点之后返回
     */
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) return depth;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return -1;
    }
}
