/**
 * Leetcode - find_mode_in_binary_search_tree
 */
package com.algorithm.problems.find_mode_in_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.*;

class Solution1 implements Solution {

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            max = Math.max(max, node.val);
            Integer num = map.getOrDefault(node.val, 0);
            map.put(node.val, num + 1);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        List<Integer> list = new ArrayList<>();

    }
}
