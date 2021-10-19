/**
 * Leetcode - diameter_of_binary_tree
 */
package com.algorithm.problems.diameter_of_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    private int result = Integer.MIN_VALUE;

    private Map<TreeNode, Integer> map = new HashMap<>();

    @Override
    public int diameterOfBinaryTree(TreeNode root) {
        result = Integer.MIN_VALUE;
        map = new HashMap<>();
        treeHeight(root);
        return result;
    }

    private int treeHeight(TreeNode node) {
        if (node == null) return 0;
        Integer v = map.get(node);
        if (v != null) return v;

        int left = treeHeight(node.left);
        int right = treeHeight(node.right);
        result = Math.max(result, left + right);
        int height = Math.max(left, right) + 1;
        map.put(node, height);
        return height;
    }
}
