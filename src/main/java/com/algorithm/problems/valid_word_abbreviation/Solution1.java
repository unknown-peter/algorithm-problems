/**
 * Leetcode - valid_word_abbreviation
 */
package com.algorithm.problems.valid_word_abbreviation;

class Solution1 implements Solution {

    @Override
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while (i < word.length() && j < abbr.length()) {
            if (Character.isLetter(abbr.charAt(j))) {
                if (word.charAt(i++) != abbr.charAt(j++)) return false;
            } else if (Character.isDigit(abbr.charAt(j))) {
                int offset = 0;
                while (Character.isDigit(abbr.charAt(j))) {
                    if (offset == 0 && abbr.charAt(j) == '0') return false;
                    offset = 10 * offset + abbr.charAt(j++) - '0';
                }
                i += offset;
            } else return false;
        }
        return i == word.length() && j == abbr.length();
    }
}
