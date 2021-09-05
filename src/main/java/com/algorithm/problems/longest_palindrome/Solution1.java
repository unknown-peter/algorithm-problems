/**
 * Leetcode - longest_palindrome
 */
package com.algorithm.problems.longest_palindrome;

class Solution1 implements Solution {

    @Override
    public int longestPalindrome(String s) {
        int[] letterCount = new int[52];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') letterCount[ch - 'a']++;
            else if (ch >= 'A' && ch <= 'Z') letterCount[26 + ch - 'A']++;
        }

        int oddCount = 0;
        for (int count : letterCount) {
            if (count % 2 == 1) oddCount++;
        }
        return (oddCount != 0) ? (s.length() - oddCount + 1) : s.length();
    }
}
