/**
 * Leetcode - occurrences_after_bigram
 */
package com.algorithm.problems.occurrences_after_bigram;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second))
                list.add(words[i + 2]);
        }
        return list.toArray(new String[list.size()]);
    }
}
