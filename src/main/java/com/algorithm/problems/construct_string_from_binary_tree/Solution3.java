/**
 * Leetcode - construct_string_from_binary_tree
 */
package com.algorithm.problems.construct_string_from_binary_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public String tree2str(TreeNode t) {
        if (t == null)
            return "";
        Stack<TreeNode> stack = new Stack<>();
        stack.push(t);
        Set<TreeNode> visited = new HashSet<>();
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            t = stack.peek();
            if (visited.contains(t)) {
                stack.pop();
                s.append(")");
            } else {
                visited.add(t);
                s.append("(" + t.val);
                if (t.left == null && t.right != null)
                    s.append("()");
                if (t.right != null)
                    stack.push(t.right);
                if (t.left != null)
                    stack.push(t.left);
            }
        }
        return s.substring(1, s.length() - 1);
    }
}
