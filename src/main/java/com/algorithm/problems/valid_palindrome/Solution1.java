/**
 * Leetcode - valid_palindrome
 */
package com.algorithm.problems.valid_palindrome;

class Solution1 implements Solution {

    @Override
    public boolean isPalindrome(String s) {
        int strLen = s.length();
        int i = 0;
        int j = strLen - 1;
        while (i < j) {
            if (Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            } else {
                if (!Character.isLetterOrDigit(s.charAt(i))) {
                    i++;
                }
                if (!Character.isLetterOrDigit(s.charAt(j))) {
                    j--;
                }
            }
        }
        return true;
    }
}
