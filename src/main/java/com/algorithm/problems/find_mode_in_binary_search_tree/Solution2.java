/**
 * Leetcode - find_mode_in_binary_search_tree
 */
package com.algorithm.problems.find_mode_in_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.Arrays;
import java.util.Stack;

class Solution2 implements Solution {

    /**
     * 递归中序遍历二叉树，当节点与上一节点值相等时计数cnt加1，否则计数cnt变为1
     * 如果计数cnt比最大数量max大，max置为cnt，数组array第一个元素置为当前节点值
     * 如果计数cnt等于最大数量max，继续向数组后面设置元素
     */
    @Override
    public int[] findMode(TreeNode root) {
        int[] array = new int[10000];
        int index = 0;
        int max = 0;
        int cnt = 1;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode pre = null;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if (pre != null) cnt = (pre.val == node.val) ? (cnt + 1) : 1;
            if (cnt >= max) {
                if (cnt > max) {
                    index = 0;
                    max = cnt;
                }
                array[index++] = node.val;
            }
            pre = node;
            node = node.right;
        }
        return Arrays.copyOfRange(array, 0, index);
    }
}
