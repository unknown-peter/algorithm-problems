/**
 * Leetcode - longest_palindromic_substring
 */
package com.algorithm.problems.longest_palindromic_substring;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     * Manacher's Algorithm
     * 在s每个字符前后增加分隔符#生成字符串str，构建str回文子串半径数组p，p[i]表示以i位置的字符为中心的最大回文子串的半径
     * 则对于不是从第一个字符开始的回文子串(例#c#a#b#b#a#f#)，子串起始位置为(i-p[i])/2
     * 为了兼容从第一个字符开始的回文子串(例#a#b#b#a#)并保持奇数个字符，在str字符串首尾增加$@字符标识开始结束
     * 对于某一位j，假如j之前有c，以c为中心的最大回文子串的最右位置为r，r>j。计算p[j]有如下两种情况：
     * (1) j关于中心c对称的位置i的回文子串包含在c的回文子串内(即p[i]<=(r-j))，则p[j]=p[i]
     * (2) j关于中心c对称的位置i的回文子串多于c的回文子串(即p[i]>(r-j))，则以j为中心的前后r-j对称，再向左右扩张查看其他是否对称
     */
    @Override
    public String longestPalindrome(String s) {
        if (s == null) return "";
        if (s.length() <= 1) return s;

        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < s.length(); i++) {
            sb.append("#").append(s.charAt(i));
        }
        sb.append("#@");
        String str = sb.toString();

        int[] p = new int[str.length()];
        int center = 0;
        int right = 0;
        int maxCenter = 0;
        int maxLength = 0;
        for (int j = 1; j < str.length() - 1; j++) {
            // 取p[i]和(r-j)之中最小的
            p[j] = (right > j) ? Math.min(p[center * 2 - j], right - j) : 1;
            // 向左右扩张回文子串半径(仅r-j)
            while (str.charAt(j - p[j]) == str.charAt(j + p[j])) p[j]++;
            // 如果j的最右位置大于当前最右位置，更新c和r
            if (right < p[j] + j) {
                right = p[j] + j;
                center = j;
            }
            // 存储更新最大回文半径长度和回文半径中心
            if (maxLength < p[j] - 1) {
                maxCenter = j;
                maxLength = p[j] - 1;
            }
        }
        int start = (maxCenter - maxLength) / 2;
        return s.substring(start, start + maxLength);
    }
}
