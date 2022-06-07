/**
 * Leetcode - generate_parentheses
 */
package com.algorithm.problems.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     * 将字符串划分为有效的两部分( left ) right 并持续细分。每部分都是有效的拼接所得完整的也是有效的
     */
    @Override
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left : generateParenthesis(c))
                    for (String right : generateParenthesis(n - 1 - c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }
}
