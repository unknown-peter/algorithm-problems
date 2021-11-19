/**
 * Leetcode - average_of_levels_in_binary_tree
 */
package com.algorithm.problems.average_of_levels_in_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution1 implements Solution {

    @Override
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Double sum = 0.0;
            int count = 0;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                sum += node.val;
                count++;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(sum / count);
        }
        return list;
    }
}
