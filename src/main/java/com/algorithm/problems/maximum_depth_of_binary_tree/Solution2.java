/**
 * Leetcode - maximum_depth_of_binary_tree
 */
package com.algorithm.problems.maximum_depth_of_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    /**
     * 遍历二叉树节点，记录遍历层数，全部遍历完成即获得二叉树最大深度
     */
    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) continue;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return depth;
    }
}
