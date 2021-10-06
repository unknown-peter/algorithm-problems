/**
 * Leetcode - find_mode_in_binary_search_tree
 */
package com.algorithm.problems.find_mode_in_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution1 implements Solution {

    @Override
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            Integer num = map.getOrDefault(node.val, 0);
            map.put(node.val, num + 1);
            max = Math.max(max, num + 1);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }

        int[] array = new int[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) array[i++] = entry.getKey();
        }
        return Arrays.copyOfRange(array, 0, i);
    }
}
