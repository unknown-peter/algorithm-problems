/**
 * Leetcode - zigzag_conversion
 */
package com.algorithm.problems.zigzag_conversion;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     * 对于Z字形第一行各字符在字符串s中索引分别为 k(2r-2)
     * 对于Z字形最后一行各字符在字符串s中索引分别为 k(2r-2)+r-1
     * 则位于其间的各行字符在字符串s中索引分别为 k(2r-2)+i 和 k(2r-2)-i
     * <p>
     * x    x   x
     * x   xx  xx
     * x x  x x x
     * x    x
     */
    @Override
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}
