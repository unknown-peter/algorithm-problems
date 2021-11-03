/**
 * Leetcode - n_ary_tree_preorder_traversal
 */
package com.algorithm.problems.n_ary_tree_preorder_traversal;

import com.algorithm.util.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> resList = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            resList.add(node.val);
            if (node.children != null) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    if (node.children.get(i) != null) stack.push(node.children.get(i));
                }
            }
        }
        return resList;
    }
}
