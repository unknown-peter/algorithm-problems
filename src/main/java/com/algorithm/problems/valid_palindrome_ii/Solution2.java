/**
 * Leetcode - valid_palindrome_ii
 */
package com.algorithm.problems.valid_palindrome_ii;

class Solution2 implements Solution {

    @Override
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                int l = i;
                int r = j - 1;
                while (l < r) {
                    if (s.charAt(l) != s.charAt(r)) break;
                    l++;
                    r--;
                    if (l >= r) return true;
                }
                i++;
                while (i < j) {
                    if (s.charAt(i) != s.charAt(j)) return false;
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}
