/**
 * Leetcode - count_and_say
 */
package com.algorithmproblems.count_and_say;

class Solution1 implements Solution {

    /**
     * 递归计算countAndSay(n-1)
     */
    @Override
    public String countAndSay(int n) {
        if (n < 1 || n > 30)
            throw new RuntimeException("argument illegal");

        if (n == 1)
            return "1";

        String preCountAndSay = countAndSay(n - 1);
        char[] seq = new char[preCountAndSay.length() * 2];
        char ch = preCountAndSay.charAt(0);
        int chCount = 0;
        int j = 0;
        for (int i = 0; i < preCountAndSay.length(); i++) {
            if (ch != preCountAndSay.charAt(i)) {
                seq[j++] = (char) ('0' + chCount);
                seq[j++] = ch;
                ch = preCountAndSay.charAt(i);
                chCount = 0;
            }
            chCount++;
        }
        seq[j++] = (char) ('0' + chCount);
        seq[j++] = ch;

        return new String(seq, 0, j);
    }

}
