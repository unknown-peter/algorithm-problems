/**
 * Leetcode - find_mode_in_binary_search_tree
 */
package com.algorithm.problems.find_mode_in_binary_search_tree;

import com.ciaoshen.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution3 implements Solution {

    int max = 0;

    int cnt = 1;

    Integer preValue = null;

    /**
     * solution2迭代方法实现
     */
    @Override
    public int[] findMode(TreeNode root) {
        max = 0;
        cnt = 1;
        preValue = null;

        List<Integer> list = new ArrayList<>();
        findMode(root, list);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
        return array;
    }

    private void findMode(TreeNode node, List<Integer> list) {
        if (node == null) return;
        findMode(node.left, list);
        if (preValue != null) cnt = (preValue == node.val) ? (cnt + 1) : 1;
        if (cnt >= max) {
            if (cnt > max) {
                list.clear();
                max = cnt;
            }
            list.add(node.val);
        }
        preValue = node.val;
        findMode(node.right, list);
    }
}
