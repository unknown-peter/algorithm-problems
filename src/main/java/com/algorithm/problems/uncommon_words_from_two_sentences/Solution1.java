/**
 * Leetcode - uncommon_words_from_two_sentences
 */
package com.algorithm.problems.uncommon_words_from_two_sentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> strCountMap = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        for (String word : words1) {
            strCountMap.put(word, strCountMap.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            strCountMap.put(word, strCountMap.getOrDefault(word, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : strCountMap.entrySet()) {
            if (entry.getValue() == 1) list.add(entry.getKey());
        }
        return list.toArray(new String[0]);
    }
}
