/**
 * Leetcode - subtree_of_another_tree
 */
package com.algorithm.problems.subtree_of_another_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    @Override
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder rootSb = new StringBuilder();
        StringBuilder subRootSb = new StringBuilder();
        treeString(root, rootSb);
        treeString(subRoot, subRootSb);
        return rootSb.toString().contains(subRootSb.toString());
    }

    private void treeString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(",null");
            return;
        }
        sb.append(",").append(node.val);
        treeString(node.left, sb);
        treeString(node.right, sb);
    }
}
