/**
 * Leetcode - longest_common_prefix
 */
package com.algorithm.problems.longest_common_prefix;


class Solution1 implements Solution {

    /**
     * 循环判断各字符串顺序位置的字符是否相同，如果超过字符串长度或字符不相同，返回对应位置的子串
     */
    @Override
    public String longestCommonPrefix(String[] strs) {
        if ((null == strs) || (strs.length == 0))
            return "";
        String pre = strs[0];
        for (int i = 0; i < pre.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if ((i >= strs[j].length()) || (strs[j].charAt(i) != pre.charAt(i)))
                    return pre.substring(0, i);
            }
        }
        return pre;

    }

}
