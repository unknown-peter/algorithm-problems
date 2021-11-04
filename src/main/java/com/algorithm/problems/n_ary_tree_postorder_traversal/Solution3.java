/**
 * Leetcode - n_ary_tree_postorder_traversal
 */
package com.algorithm.problems.n_ary_tree_postorder_traversal;

import com.algorithm.util.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution3 implements Solution {

    /**
     * 利用栈进行前序遍历(注意子节点从前向后放入栈内)，每次在List首位插入元素即为后序遍历的结果
     */
    @Override
    public List<Integer> postorder(Node root) {
        if (root == null) return new ArrayList<>();
        List<Integer> resList = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            resList.add(0, node.val);
            if (node.children != null) {
                for (int i = 0; i < node.children.size(); i++) {
                    if (node.children.get(i) != null) stack.push(node.children.get(i));
                }
            }
        }
        return resList;
    }
}
