/**
 * Leetcode - lowest_common_ancestor_of_a_binary_search_tree
 */
package com.algorithm.problems.lowest_common_ancestor_of_a_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution1 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Value of current node or parent node.
        int parentVal = root.val;

        // Value of p
        int pVal = p.val;

        // Value of q;
        int qVal = q.val;

        if (pVal > parentVal && qVal > parentVal) {
            // If both p and q are greater than parent
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            // If both p and q are lesser than parent
            return lowestCommonAncestor(root.left, p, q);
        } else {
            // We have found the split point, i.e. the LCA node.
            return root;
        }
    }
}
