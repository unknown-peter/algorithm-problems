/**
 * Leetcode - leaf_similar_trees
 */
package com.algorithm.problems.leaf_similar_trees;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution1 implements Solution {

    @Override
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1List = getLeaf(root1);
        List<Integer> root2List = getLeaf(root2);

        return root1List.equals(root2List);
    }

    private List<Integer> getLeaf(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if (node.left == null && node.right == null) {
                list.add(node.val);
            }
            node = node.right;
        }
        return list;
    }
}
