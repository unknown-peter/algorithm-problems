/**
 * Leetcode - add_binary
 */
package com.algorithm.problems.add_binary;

class Solution2 implements Solution {

    @Override
    public String addBinary(String a, String b) {
        char[] c = new char[Math.max(a.length(), b.length()) + 1];
        int carry = 0;
        int cIndex = c.length - 1;

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int aDigit = (i < 0) ? 0 : a.charAt(i) - '0';
            int bDigit = (j < 0) ? 0 : b.charAt(j) - '0';
            int tmp = aDigit + bDigit + carry;
            c[cIndex--] = (char) (tmp % 2 + '0');
            carry = tmp / 2;
        }
        c[cIndex] = (char) (carry + '0');
        return (carry > 0) ? new String(c) : new String(c, 1, c.length - 1);
    }

}
