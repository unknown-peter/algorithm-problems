/**
 * Leetcode - sum_of_root_to_leaf_binary_numbers
 */
package com.algorithm.problems.sum_of_root_to_leaf_binary_numbers;

import com.ciaoshen.leetcode.util.TreeNode;
import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    @Override
    public int sumRootToLeaf(TreeNode root) {
        int sum = 0;
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, root.val));
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; i--) {
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode node = pair.getKey();
                if (node.left == null && node.right == null) {
                    sum += pair.getValue();
                    continue;
                }
                if (node.left != null) {
                    queue.add(new Pair<>(node.left, (pair.getValue() << 1) + node.left.val));
                }
                if (node.right != null) {
                    queue.add(new Pair<>(node.right, (pair.getValue() << 1) + node.right.val));
                }
            }
        }
        return sum;
    }
}
