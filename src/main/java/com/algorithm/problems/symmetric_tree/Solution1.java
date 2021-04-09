/**
 * Leetcode - symmetric_tree
 */
package com.algorithm.problems.symmetric_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            if (left.val == right.val) {
                return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
            } else {
                return false;
            }
        }
    }
}
