/**
 * Leetcode - convert_sorted_array_to_binary_search_tree
 */
package com.algorithm.problems.convert_sorted_array_to_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Arrays;

class Solution2 implements Solution {

    /**
     * 方法内从中间拆分成两个子数组递归
     */
    @Override
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int k = (nums.length - 1) / 2;
        TreeNode node = new TreeNode(nums[k]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, k));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, k + 1, nums.length));
        return node;
    }
}
