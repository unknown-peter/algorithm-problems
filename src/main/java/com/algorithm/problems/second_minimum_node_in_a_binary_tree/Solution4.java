/**
 * Leetcode - second_minimum_node_in_a_binary_tree
 */
package com.algorithm.problems.second_minimum_node_in_a_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution4 implements Solution {

    int min1;
    long ans = Long.MAX_VALUE;

    /**
     * solution from leetcode
     */
    @Override
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

    public void dfs(TreeNode root) {
        if (root != null) {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
}
