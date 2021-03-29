/**
 * Leetcode - longest_common_prefix
 */
package com.algorithm.problems.longest_common_prefix;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 依次比较字符串与上次比较得到的最长前缀字符串，如果不是该字符串的最长前缀，则最长前缀字符串长度减一
     */
    @Override
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }

}
