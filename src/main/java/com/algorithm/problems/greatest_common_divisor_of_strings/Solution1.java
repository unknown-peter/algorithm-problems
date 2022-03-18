/**
 * Leetcode - greatest_common_divisor_of_strings
 */
package com.algorithm.problems.greatest_common_divisor_of_strings;

class Solution1 implements Solution {

    /**
     * 取str1和str2中最短的str
     * 对于长度是str倍数的str1和str2，拼接str到str1和str2长度并判断是否相等
     * 如果相等则找到gcd字符串，否则缩短str继续
     */
    @Override
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() == str2.length()) return str1.equals(str2) ? str1 : "";

        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        for (int i = minStr.length(); i > 0; i--) {
            String gcd = minStr.substring(0, i);
            if (gcdString(str1, gcd) && gcdString(str2, gcd)) return gcd;
        }
        return "";
    }

    private boolean gcdString(String str, String gcd) {
        if (str.length() == gcd.length()) return str.equals(gcd);

        if (str.length() % gcd.length() != 0) return false;
        int count = str.length() / gcd.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append(gcd);
        return sb.toString().equals(str);
    }
}
