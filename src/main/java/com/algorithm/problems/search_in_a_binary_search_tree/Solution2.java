/**
 * Leetcode - search_in_a_binary_search_tree
 */
package com.algorithm.problems.search_in_a_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    @Override
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        TreeNode node = root;
        while (node != null) {
            if (node.val == val) return node;
            node = (node.val < val) ? node.right : node.left;
        }
        return null;
    }
}
