/**
 * Leetcode - binary_tree_right_side_view
 */
package com.algorithm.problems.binary_tree_right_side_view;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    private List<Integer> list = new ArrayList<>();

    /**
     * 向下深度优先遍历，从右至左，取每层深度的第一个放入list
     */
    @Override
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<>();
        if (root == null) return list;
        dfs(root, 0);
        return list;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;
        if (depth == list.size()) list.add(node.val);
        dfs(node.right, depth + 1);
        dfs(node.left, depth + 1);
    }
}
