/**
 * Leetcode - keyboard_row
 */
package com.algorithm.problems.keyboard_row;

import java.util.ArrayList;
import java.util.List;

class Solution3 implements Solution {

    @Override
    public String[] findWords(String[] words) {
        String[] rows = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int[] charRow = new int[26];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                charRow[rows[i].charAt(j) - 'a'] = i;
            }
        }

        List<String> wordsList = new ArrayList<>();
        for (String word : words) {
            int first = charRow[Character.toLowerCase(word.charAt(0)) - 'a'];
            int i = 1;
            for (; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (charRow[ch - 'a'] != first) break;
            }
            if (i == word.length()) wordsList.add(word);
        }
        return wordsList.toArray(new String[0]);
    }
}
