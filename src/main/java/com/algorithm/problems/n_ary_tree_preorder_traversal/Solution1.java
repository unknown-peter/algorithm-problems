/**
 * Leetcode - n_ary_tree_preorder_traversal
 */
package com.algorithm.problems.n_ary_tree_preorder_traversal;


import com.algorithm.util.Node;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    private List<Integer> resList = new ArrayList<>();

    @Override
    public List<Integer> preorder(Node root) {
        resList = new ArrayList<>();
        naryTreeOrder(root);
        return resList;
    }

    private void naryTreeOrder(Node node) {
        if (node == null) return;
        resList.add(node.val);
        if (node.children == null) return;
        for (Node children : node.children) {
            naryTreeOrder(children);
        }
    }
}
