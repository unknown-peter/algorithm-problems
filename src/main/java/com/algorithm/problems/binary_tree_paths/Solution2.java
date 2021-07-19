/**
 * Leetcode - binary_tree_paths
 */
package com.algorithm.problems.binary_tree_paths;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    @Override
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        binaryTreePaths(root, list, "");
        return list;
    }

    private void binaryTreePaths(TreeNode root, List<String> list, String pre) {
        if (root.left == null && root.right == null) list.add(pre + root.val);
        if (root.left != null) binaryTreePaths(root.left, list, pre + root.val + "->");
        if (root.right != null) binaryTreePaths(root.right, list, pre + root.val + "->");
    }
}
