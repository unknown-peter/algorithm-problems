/**
 * Leetcode - remove_all_adjacent_duplicates_in_string
 */
package com.algorithm.problems.remove_all_adjacent_duplicates_in_string;

class Solution1 implements Solution {

    /**
     * 定义char数组res和index i. 遍历s，当i!=0且res[i-1]等于当前字符ch时，有连续重复字符，i减一
     * 否则res[i]=ch并且i加一
     */
    @Override
    public String removeDuplicates(String s) {
        if (s.length() == 1) return s;

        char[] res = new char[s.length()];
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (i != 0 && res[i - 1] == ch) i -= 1;
            else res[i++] = ch;
        }
        return new String(res, 0, i);
    }
}
