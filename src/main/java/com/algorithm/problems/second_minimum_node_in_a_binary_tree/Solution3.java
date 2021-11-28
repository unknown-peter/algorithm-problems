/**
 * Leetcode - second_minimum_node_in_a_binary_tree
 */
package com.algorithm.problems.second_minimum_node_in_a_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.HashSet;
import java.util.Set;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> uniques = new HashSet<Integer>();
        dfs(root, uniques);

        int min1 = root.val;
        long ans = Long.MAX_VALUE;
        for (int v : uniques) {
            if (min1 < v && v < ans) ans = v;
        }
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

    public void dfs(TreeNode root, Set<Integer> uniques) {
        if (root != null) {
            uniques.add(root.val);
            dfs(root.left, uniques);
            dfs(root.right, uniques);
        }
    }
}
