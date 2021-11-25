/**
 * Leetcode - two_sum_iv_input_is_a_bst
 */
package com.algorithm.problems.two_sum_iv_input_is_a_bst;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.HashSet;
import java.util.Set;

class Solution2 implements Solution {

    private Set<Integer> set = new HashSet<>();

    @Override
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();
        return find(root, k);
    }

    private boolean find(TreeNode node, int k) {
        if (node == null) return false;
        if (set.contains(k - node.val)) return true;
        set.add(node.val);
        return find(node.left, k) || find(node.right, k);
    }
}
