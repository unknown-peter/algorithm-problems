/**
 * Leetcode - verifying_an_alien_dictionary
 */
package com.algorithm.problems.verifying_an_alien_dictionary;

class Solution1 implements Solution {

    @Override
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length == 1) return true;

        int[] orderArray = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderArray[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            String s1 = words[i - 1];
            String s2 = words[i];
            int j = 0;
            int n = Math.min(s1.length(), s2.length());
            for (; j < n; j++) {
                int s1Index = orderArray[s1.charAt(j) - 'a'];
                int s2Index = orderArray[s2.charAt(j) - 'a'];
                if (s2Index > s1Index) break;
                if (s2Index < s1Index) return false;
            }
            if (j == n && s1.length() > s2.length()) return false;
        }
        return true;
    }
}
