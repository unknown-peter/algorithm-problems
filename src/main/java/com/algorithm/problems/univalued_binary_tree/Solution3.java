/**
 * Leetcode - univalued_binary_tree
 */
package com.algorithm.problems.univalued_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution3 implements Solution {

    List<Integer> vals;

    /**
     * solution from leetcode
     */
    @Override
    public boolean isUnivalTree(TreeNode root) {
        vals = new ArrayList();
        dfs(root);
        for (int v : vals)
            if (v != vals.get(0))
                return false;
        return true;
    }

    public void dfs(TreeNode node) {
        if (node != null) {
            vals.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
    }
}
