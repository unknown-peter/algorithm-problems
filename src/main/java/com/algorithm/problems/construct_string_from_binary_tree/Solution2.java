/**
 * Leetcode - construct_string_from_binary_tree
 */
package com.algorithm.problems.construct_string_from_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public String tree2str(TreeNode t) {
        if (t == null)
            return "";
        if (t.left == null && t.right == null)
            return t.val + "";
        if (t.right == null)
            return t.val + "(" + tree2str(t.left) + ")";
        return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
    }
}
