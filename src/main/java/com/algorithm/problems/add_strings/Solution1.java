/**
 * Leetcode - add_strings
 */
package com.algorithm.problems.add_strings;

class Solution1 implements Solution {

    @Override
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carry += num2.charAt(j) - '0';
                j--;
            }

            sb.insert(0, carry % 10);
            carry = (carry > 9) ? 1 : 0;
        }
        if (carry != 0) sb.insert(0, carry);
        return sb.toString();
    }
}
