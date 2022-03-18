/**
 * Leetcode - greatest_common_divisor_of_strings
 */
package com.algorithm.problems.greatest_common_divisor_of_strings;

class Solution3 implements Solution {

    /**
     * 如果str1和str2有公共子串，则(str1+str2)和(str2+str1)相等
     * 其公共子串的长度即为str1和str2长度的最大公约数
     */
    @Override
    public String gcdOfStrings(String str1, String str2) {
        return (str1 + str2).equals(str2 + str1)
                ? str1.substring(0, getGcd(str1.length(), str2.length()))
                : "";
    }

    private int getGcd(int a, int b) {
        do {
            a = a > b ? a - b : a;
            b = a < b ? b - a : b;
        } while (a != b);
        return a;
    }
}
