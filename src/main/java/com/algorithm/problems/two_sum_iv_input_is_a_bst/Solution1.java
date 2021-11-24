/**
 * Leetcode - two_sum_iv_input_is_a_bst
 */
package com.algorithm.problems.two_sum_iv_input_is_a_bst;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        addNodeToList(root, list);
        for (Integer v : list) {
            if (set.contains(k - v)) return true;
            set.add(v);
        }
        return false;
    }

    private void addNodeToList(TreeNode node, List<Integer> list) {
        if (node == null) return;
        if (node.left != null) addNodeToList(node.left, list);
        list.add(node.val);
        if (node.right != null) addNodeToList(node.right, list);
    }
}
