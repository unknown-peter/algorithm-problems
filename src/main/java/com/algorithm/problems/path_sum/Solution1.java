/**
 * Leetcode - path_sum
 */
package com.algorithm.problems.path_sum;

import com.ciaoshen.leetcode.util.TreeNode;
import javafx.util.Pair;

import java.util.Stack;

class Solution1 implements Solution {

    /**
     * 从二叉树左节点依次向下查找，到叶子结点时sum不等于targetSum，则向上回溯向右节点查找
     */
    @Override
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        int value = 0;
        Stack<Pair<TreeNode, Boolean>> stack = new Stack<>();
        stack.push(new Pair<>(root, false));
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek().getKey();
            value += node.val;
            // 查找到叶子结点且sum等于targetSum，返回true
            if (node.left == null && node.right == null && value == targetSum) return true;
            // 查找到叶子结点但sum不等于targetSum，向上回溯
            if (node.left == null && node.right == null) {
                TreeNode backwardNode;
                while ((backwardNode = stack.pop().getKey()) != null && !stack.isEmpty()) {
                    value -= backwardNode.val;
                    TreeNode parentNode = stack.peek().getKey();
                    // 父节点下只有这一个节点，继续向上回溯
                    if (parentNode.left == null || parentNode.right == null) continue;
                    // 父节点下有左右两个节点，右节点已查找完，继续向上回溯
                    if (parentNode.right.val == backwardNode.val && stack.peek().getValue()) continue;
                    // 父节点下有左右两个节点，右节点未查找，设置父节点标记位，其右节点入栈继续查找
                    if (parentNode.left.val == backwardNode.val && !stack.peek().getValue()) {
                        stack.push(new Pair<>(stack.pop().getKey(), true));
                        stack.push(new Pair<>(parentNode.right, false));
                        break;
                    }
                }
            } else {
                // 未查找到叶子结点，继续向下查找计算sum
                if (node.left != null) stack.push(new Pair<>(node.left, false));
                else stack.push(new Pair<>(node.right, false));
            }
        }
        return false;
    }
}
