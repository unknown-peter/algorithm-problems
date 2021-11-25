/**
 * Leetcode - two_sum_iv_input_is_a_bst
 */
package com.algorithm.problems.two_sum_iv_input_is_a_bst;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution3 implements Solution {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (set.contains(k - node.val)) return true;
                set.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return false;
    }
}
