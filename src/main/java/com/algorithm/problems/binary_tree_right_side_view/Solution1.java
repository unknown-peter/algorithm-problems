/**
 * Leetcode - binary_tree_right_side_view
 */
package com.algorithm.problems.binary_tree_right_side_view;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution1 implements Solution {

    @Override
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.peek().val);
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }
        return list;
    }
}
