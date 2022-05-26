/**
 * Leetcode - zigzag_conversion
 */
package com.algorithm.problems.zigzag_conversion;

class Solution1 implements Solution {

    /**
     * 对于字符串s及其行数r，计算Z字形字符串总有同一行下一元素的偏移公式如下
     * 初始每一行第一个元素分别为s中第1-r个元素，
     * 每一行第二个元素分别为第一个元素位置再加偏移2r-2、2r-4、2r-6...(偏移为0的去掉)
     * 每一行第三个元素分别为第二个元素位置再加偏移0、2、4、6...(偏移为0的去掉)
     * 因此初始化每行的offset=2*i(i表示第i行)，每次下一元素的偏移offset=2r-2-offset
     * <p>
     * x    x   x              0   2r-2   0   2r-2
     * x   xx  xx              2   2r-4   2   2r-4
     * x x  x x x              4   2r-6   4   2r-6
     * x    x                  6   2r-8   6   2r-8
     */
    @Override
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 0; i < numRows; i++) {
            int offset = 2 * i;
            for (int j = i; j < n; j = j + offset) {
                // 偏移为0的去掉(第一个字符除外)
                if (offset != 0) sb.append(s.charAt(j));
                offset = 2 * numRows - 2 - offset;
            }
        }
        return sb.toString();
    }
}
