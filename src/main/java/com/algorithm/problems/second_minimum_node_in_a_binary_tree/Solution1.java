/**
 * Leetcode - second_minimum_node_in_a_binary_tree
 */
package com.algorithm.problems.second_minimum_node_in_a_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution1 implements Solution {

    @Override
    public int findSecondMinimumValue(TreeNode root) {
        int min = Integer.MAX_VALUE;
        long secondMin = Long.MAX_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node.val <= min) {
                    min = node.val;
                } else if (node.val <= secondMin) {
                    secondMin = node.val;
                }
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return (secondMin == Long.MAX_VALUE) ? -1 : (int) secondMin;
    }
}
