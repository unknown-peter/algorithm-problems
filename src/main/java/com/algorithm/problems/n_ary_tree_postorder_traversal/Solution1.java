/**
 * Leetcode - n_ary_tree_postorder_traversal
 */
package com.algorithm.problems.n_ary_tree_postorder_traversal;

import com.algorithm.util.Node;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    private List<Integer> resList = new ArrayList<>();

    @Override
    public List<Integer> postorder(Node root) {
        resList = new ArrayList<>();
        naryTreeOrder(root);
        return resList;
    }

    private void naryTreeOrder(Node node) {
        if (node == null) return;
        if (node.children != null) {
            for (Node children : node.children) {
                naryTreeOrder(children);
            }
        }

        resList.add(node.val);
    }
}
