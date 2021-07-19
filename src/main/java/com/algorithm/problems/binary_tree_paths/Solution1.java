/**
 * Leetcode - binary_tree_paths
 */
package com.algorithm.problems.binary_tree_paths;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution1 implements Solution {

    @Override
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;

        List<String> list = new ArrayList<>();
        List<String> pathLeft = binaryTreePaths(root.left);
        List<String> pathRight = binaryTreePaths(root.right);
        if (pathLeft == null && pathRight == null) {
            list.add(String.valueOf(root.val));
        } else {
            if (pathLeft != null) {
                list.addAll(pathLeft.stream().map(v -> root.val + "->" + v).collect(Collectors.toList()));
            }
            if (pathRight != null) {
                list.addAll(pathRight.stream().map(v -> root.val + "->" + v).collect(Collectors.toList()));
            }
        }
        return list;
    }
}
