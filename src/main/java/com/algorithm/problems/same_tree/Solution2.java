/**
 * Leetcode - same_tree
 */
package com.algorithm.problems.same_tree;

import java.util.Stack;

import com.ciaoshen.leetcode.util.TreeNode;

class Solution2 implements Solution {

    /**
     * 前序遍历二叉树并比较节点处值
     */
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pNodeStack = new Stack<>();
        Stack<TreeNode> qNodeStack = new Stack<>();
        TreeNode pTmp = p;
        TreeNode qTmp = q;

        while (true) {
            if (pTmp != null && qTmp != null) {
                if (pTmp.val != qTmp.val)
                    return false;
                // 中间节点存到栈中，再比较其左节点
                pNodeStack.push(pTmp);
                qNodeStack.push(qTmp);
                pTmp = pTmp.left;
                qTmp = qTmp.left;
            } else if (pTmp == null && qTmp == null) {
                // 全部遍历完成，两个二叉树相等
                if (pNodeStack.isEmpty() && qNodeStack.isEmpty())
                    break;
                if (pNodeStack.isEmpty() || qNodeStack.isEmpty())
                    return false;
                // 左节点遍历完之后，从栈中取出中间节点，比较其右节点
                pTmp = pNodeStack.pop().right;
                qTmp = qNodeStack.pop().right;
            } else {
                return false;
            }
        }
        return true;
    }

}
