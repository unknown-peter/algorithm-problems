/**
 * Leetcode - longest_palindromic_substring
 */
package com.algorithm.problems.longest_palindromic_substring;

class Solution1 implements Solution {

    @Override
    public String longestPalindrome(String s) {
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int r = s.length() - 1;
            while (res.length() < (r - i + 1)) {
                if (s.charAt(r) == ch && isPalindrome(s, i, r)) {
                    res = s.substring(i, r + 1);
                    break;
                }
                r--;
            }
        }
        return res;
    }

    private boolean isPalindrome(String s, int left, int right) {
        int n = right - left + 1;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(left + i) != s.charAt(right - i)) return false;
        }
        return true;
    }
}
