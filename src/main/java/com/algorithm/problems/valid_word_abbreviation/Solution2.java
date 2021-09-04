/**
 * Leetcode - valid_word_abbreviation
 */
package com.algorithm.problems.valid_word_abbreviation;

class Solution2 implements Solution {

    @Override
    public boolean validWordAbbreviation(String word, String abbr) {
        int offset = 0;
        int p = 0;
        for (int i = 0; i < abbr.length(); i++) {
            if (Character.isDigit(abbr.charAt(i))) {
                if (offset == 0 && abbr.charAt(i) == '0') return false;
                offset = 10 * offset + abbr.charAt(i) - '0';
            } else if (Character.isLetter(abbr.charAt(i))) {
                p += offset;
                if (p >= word.length() || word.charAt(p++) != abbr.charAt(i)) return false;
                offset = 0;
            } else return false;
        }
        return p + offset == word.length();
    }
}
