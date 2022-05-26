/**
 * Leetcode - zigzag_conversion
 */
package com.algorithm.problems.zigzag_conversion;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 对于字符串s按照Z字形排列，只有向下或向上两个方向，行加1或减1
     * 因此收集每一行的字符，最后再汇总即可
     */
    @Override
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
