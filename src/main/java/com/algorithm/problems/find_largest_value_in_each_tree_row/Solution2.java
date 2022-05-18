/**
 * Leetcode - find_largest_value_in_each_tree_row
 */
package com.algorithm.problems.find_largest_value_in_each_tree_row;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    private List<Integer> list = new ArrayList<>();

    @Override
    public List<Integer> largestValues(TreeNode root) {
        list = new ArrayList<>();
        if (root == null) return new ArrayList<>();

        search(root, 0);
        return list;
    }

    private void search(TreeNode node, int depth) {
        if (node == null) return;

        if (depth == list.size()) list.add(node.val);
        else if (depth < list.size()) {
            Integer value = list.get(depth);
            if (node.val > value) list.set(depth, node.val);
        }
        search(node.left, depth + 1);
        search(node.right, depth + 1);
    }
}
