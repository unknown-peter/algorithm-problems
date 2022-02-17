/**
 * Leetcode - delete_columns_to_make_sorted
 */
package com.algorithm.problems.delete_columns_to_make_sorted;

class Solution1 implements Solution {

    @Override
    public int minDeletionSize(String[] strs) {
        if (strs.length == 1) return 0;
        int n = strs[0].length();
        int deleteColumn = 0;
        for (int i = 0; i < n; i++) {
            char ch = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) < ch) {
                    deleteColumn++;
                    break;
                }
                ch = str.charAt(i);
            }
        }
        return deleteColumn;
    }
}
