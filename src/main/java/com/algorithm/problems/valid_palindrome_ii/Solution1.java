/**
 * Leetcode - valid_palindrome_ii
 */
package com.algorithm.problems.valid_palindrome_ii;

class Solution1 implements Solution {

    @Override
    public boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        return isValid(str, 0, str.length - 1, 0);
    }

    private boolean isValid(char[] str, int i, int j, int count) {
        if (count > 1) return false;
        while (i < j) {
            if (str[i] != str[j])
                return isValid(str, i, j - 1, count + 1) || isValid(str, i + 1, j, count + 1);
            i++;
            j--;
        }
        return true;
    }
}
