/**
 * Leetcode - valid_palindrome_ii
 */
package com.algorithm.problems.valid_palindrome_ii;

class Solution1 implements Solution {

    @Override
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int delNum = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (delNum == 1) return false;
                if ((i + 1) == j) return true;
                if (s.charAt(i) == s.charAt(j - 1)) {
                    j--;
                    delNum++;
                } else if (s.charAt(i + 1) == s.charAt(j)) {
                    i++;
                    delNum++;
                } else return false;
            }
        }
        return true;
    }
}
