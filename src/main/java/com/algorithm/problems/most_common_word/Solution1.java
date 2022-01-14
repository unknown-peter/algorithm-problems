/**
 * Leetcode - most_common_word
 */
package com.algorithm.problems.most_common_word;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution1 implements Solution {

    @Override
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        Set<String> bannedSet = Arrays.stream(banned).collect(Collectors.toSet());
        int countMax = 0;
        String res = null;

        int i = 0;
        while (i < paragraph.length()) {
            StringBuilder sb = new StringBuilder();
            while (i < paragraph.length() && Character.isLetter(paragraph.charAt(i))) {
                sb.append(paragraph.charAt(i));
                i++;
            }
            while (i < paragraph.length() && !Character.isLetter(paragraph.charAt(i))) i++;

            String word = sb.toString().toLowerCase();
            if (bannedSet.contains(word)) continue;
            int count = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, ++count);
            if (count > countMax) {
                countMax = count;
                res = word;
            }
        }
        return res;
    }
}
