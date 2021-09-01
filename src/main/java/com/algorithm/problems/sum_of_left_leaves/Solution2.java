/**
 * Leetcode - sum_of_left_leaves
 */
package com.algorithm.problems.sum_of_left_leaves;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    @Override
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) sum += node.left.val;
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return sum;
    }
}
