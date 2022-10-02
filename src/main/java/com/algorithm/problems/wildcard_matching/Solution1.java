/**
 * Leetcode - wildcard_matching
 */
package com.algorithm.problems.wildcard_matching;

class Solution1 implements Solution {

    /**
     * 递归字符串和pattern串，查看是否匹配
     * 判断当前s和p首字符是否匹配（相等或p首字符为'?'）
     * 如果p首字符为'*'，则递归判断s及p[1:]和s[1:]及p这两组中是否有匹配的即可
     * 如果p首字符不为'*'，则需要s和p首字符匹配且s[1:]及p[1:]匹配
     */
    @Override
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        if (s.isEmpty()) return p.charAt(0) == '*' && isMatch(s, p.substring(1));

        boolean isFirstMatch = s.charAt(0) == p.charAt(0) || p.charAt(0) == '?';
        if (p.charAt(0) == '*') return isMatch(s, p.substring(1)) || isMatch(s.substring(1), p);
        return isFirstMatch && isMatch(s.substring(1), p.substring(1));
    }
}
