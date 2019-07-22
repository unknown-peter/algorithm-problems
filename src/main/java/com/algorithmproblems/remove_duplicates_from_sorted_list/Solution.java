/**
 * Leetcode - remove_duplicates_from_sorted_list
 */
package com.algorithmproblems.remove_duplicates_from_sorted_list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ciaoshen.leetcode.util.ListNode;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public ListNode deleteDuplicates(ListNode head);
}
