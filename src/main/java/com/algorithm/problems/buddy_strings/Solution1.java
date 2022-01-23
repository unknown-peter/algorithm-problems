/**
 * Leetcode - buddy_strings
 */
package com.algorithm.problems.buddy_strings;

class Solution1 implements Solution {

    @Override
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            int[] chArray = new int[26];
            for (char ch : s.toCharArray()) {
                chArray[ch - 'a']++;
                if (chArray[ch - 'a'] == 2) return true;
            }
            return false;
        } else {
            int count = 0;
            int[] sArray = new int[2];
            int[] gArray = new int[2];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (count >= 2) return false;
                    sArray[count] = s.charAt(i);
                    gArray[count] = goal.charAt(i);
                    count++;
                }
            }
            return (sArray[0] == gArray[1]) && (sArray[1] == gArray[0]);
        }
    }
}
