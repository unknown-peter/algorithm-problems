/**
 * Leetcode - generate_parentheses
 */
package com.algorithm.problems.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     * 回溯算法，只留取有效的字符串
     */
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }

        if (open < max) {
            cur.append("(");
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        // )的个数少于(的时候才添加)，能够保证字符串有效
        if (close < open) {
            cur.append(")");
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
