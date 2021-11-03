/**
 * Leetcode - n_ary_tree_postorder_traversal
 */
package com.algorithm.problems.n_ary_tree_postorder_traversal;

import com.algorithm.util.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> postorder(Node root);
}
