/**
 * Leetcode - merge_two_binary_trees
 */
package com.algorithm.problems.merge_two_binary_trees;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    @Override
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        TreeNode node = new TreeNode(-1);
        if (root1 == null) {
            node.val = root2.val;
            node.left = mergeTrees(null, root2.left);
            node.right = mergeTrees(null, root2.right);
        } else if (root2 == null) {
            node.val = root1.val;
            node.left = mergeTrees(root1.left, null);
            node.right = mergeTrees(root1.right, null);
        } else {
            node.val = root1.val + root2.val;
            node.left = mergeTrees(root1.left, root2.left);
            node.right = mergeTrees(root1.right, root2.right);
        }
        return node;

//        if (t1 == null)
//            return t2;
//        if (t2 == null)
//            return t1;
//        t1.val += t2.val;
//        t1.left = mergeTrees(t1.left, t2.left);
//        t1.right = mergeTrees(t1.right, t2.right);
//        return t1;
    }
}
