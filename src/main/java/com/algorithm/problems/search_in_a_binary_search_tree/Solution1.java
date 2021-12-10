/**
 * Leetcode - search_in_a_binary_search_tree
 */
package com.algorithm.problems.search_in_a_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        return (root.val < val) ? searchBST(root.right, val) : searchBST(root.left, val);
    }
}
