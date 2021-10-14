/**
 * Leetcode - minimum_absolute_difference_in_bst
 */
package com.algorithm.problems.minimum_absolute_difference_in_bst;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        TreeNode pLeft = root.left;
        TreeNode pRight = root.right;
        while (pLeft != null) {
            min = Math.min(min, root.val - pLeft.val);
            pLeft = pLeft.right;
        }
        while (pRight != null) {
            min = Math.min(min, pRight.val - root.val);
            pRight = pRight.left;
        }

        return Math.min(min, Math.min(getMinimumDifference(root.left), getMinimumDifference(root.right)));
    }
}
