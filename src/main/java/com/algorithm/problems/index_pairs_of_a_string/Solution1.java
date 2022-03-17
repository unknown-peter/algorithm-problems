/**
 * Leetcode - index_pairs_of_a_string
 */
package com.algorithm.problems.index_pairs_of_a_string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public int[][] indexPairs(String text, String[] words) {
        Arrays.sort(words, Comparator.comparing(String::length));

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (String word : words) {
                if (isInText(text, i, word))
                    list.add(new int[]{i, i + word.length() - 1});
            }
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }

    private boolean isInText(String text, int index, String word) {
        if ((text.length() - index) < word.length()) return false;
        for (int i = 0; i < word.length(); i++) {
            if (text.charAt(index + i) != word.charAt(i)) return false;
        }
        return true;
    }
}
