/**
 * Leetcode - leaf_similar_trees
 */
package com.algorithm.problems.leaf_similar_trees;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {


    @Override
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getLeaf(root1, list1);
        getLeaf(root2, list2);

        return list1.equals(list2);
    }

    private void getLeaf(TreeNode node, List<Integer> list) {
        if (node == null) return;
        getLeaf(node.left, list);
        if (node.left == null && node.right == null) list.add(node.val);
        getLeaf(node.right, list);
    }
}
