/**
 * Leetcode - convert_sorted_array_to_binary_search_tree
 */
package com.algorithm.problems.convert_sorted_array_to_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int l, int h) {
        if (l > h) return null;
        int k = (h - l) / 2 + l;
        TreeNode node = new TreeNode(nums[k]);
        node.left = sortedArrayToBST(nums, l, k - 1);
        node.right = sortedArrayToBST(nums, k + 1, h);
        return node;
    }
}
