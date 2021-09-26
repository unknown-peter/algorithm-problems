/**
 * Leetcode - repeated_substring_pattern
 */
package com.algorithm.problems.repeated_substring_pattern;

class Solution1 implements Solution {

    /**
     * 从1-s.length()/2遍历作为子串长度，查看是否满足重复子串规则
     */
    @Override
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            if (repeatedSubstringPattern(s, i)) return true;
        }
        return false;
    }

    private boolean repeatedSubstringPattern(String s, int num) {
        int n = s.length();
        if (n % num != 0) return false;

        // 字符串里偶数个字符 且 前一半和后一半子串相同则返回true
        if (n % 2 == 0 && s.substring(0, n / 2).equals(s.substring(n / 2, n))) return true;

        // 子串和其后续同等长度子串是否相同
        int cnt = n / num;
        String subStr = s.substring(0, num);
        for (int i = 1; i < cnt; i++) {
            if (!subStr.equals(s.substring(i * num, (i + 1) * num))) return false;
        }
        return true;
    }
}
