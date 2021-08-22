/**
 * Leetcode - find_the_difference
 */
package com.algorithm.problems.find_the_difference;

class Solution1 implements Solution {

    @Override
    public char findTheDifference(String s, String t) {
        int[] charArray = new int[26];
        for (int i = 0; i < t.length(); i++) {
            charArray[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            int count = charArray[s.charAt(i) - 'a'];
            if (count == 0) return s.charAt(i);
            charArray[s.charAt(i) - 'a']--;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != 0) return (char) ('a' + i);
        }
        return Character.MIN_VALUE;
    }
}
