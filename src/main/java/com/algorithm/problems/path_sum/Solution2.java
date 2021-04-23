/**
 * Leetcode - path_sum
 */
package com.algorithm.problems.path_sum;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    /**
     * targetSum减去当前节点值，递归左右节点
     */
    @Override
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == targetSum;
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}
