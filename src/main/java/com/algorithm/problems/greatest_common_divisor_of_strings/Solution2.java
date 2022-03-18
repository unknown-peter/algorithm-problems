/**
 * Leetcode - greatest_common_divisor_of_strings
 */
package com.algorithm.problems.greatest_common_divisor_of_strings;

class Solution2 implements Solution {

    /**
     * 如果str1和str2有公共gcd字符串，则两个字符串中短字符串必为长字符串的子串
     * 判断长字符是否以短字符起始，如果不是则没有公共gcd字符串
     * 如果是则从长字符串头部减去短字符串并向下继续递归，直到有str被减成空串，返回另一str
     */
    @Override
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) return gcdOfStrings(str2, str1);

        if ("".equals(str2)) return str1;
        if (!str1.startsWith(str2)) return "";
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }
}
