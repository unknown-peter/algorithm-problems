/**
 * Leetcode - maximum_depth_of_n_ary_tree
 */
package com.algorithm.problems.maximum_depth_of_n_ary_tree;

import com.algorithm.util.Node;

class Solution1 implements Solution {

    @Override
    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null) return 1;
        int depth = 1;
        for (Node node : root.children) depth = Math.max(depth, maxDepth(node) + 1);
        return depth;
    }
}
