/**
 * Leetcode - maximum_depth_of_n_ary_tree
 */
package com.algorithm.problems.maximum_depth_of_n_ary_tree;

import com.algorithm.util.Node;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    @Override
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            for (int i = queue.size(); i > 0; i--) {
                Node node = queue.poll();
                queue.addAll(node.children);
            }
        }
        return depth;
    }
}
