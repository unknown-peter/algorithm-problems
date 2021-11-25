/**
 * Leetcode - two_sum_iv_input_is_a_bst
 */
package com.algorithm.problems.two_sum_iv_input_is_a_bst;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        addNodeToList(root, list);
        for (int i = 0, j = list.size() - 1; i < j; ) {
            int sum = list.get(i) + list.get(j);
            if (sum == k) return true;
            if (sum < k) i++;
            else j--;
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
