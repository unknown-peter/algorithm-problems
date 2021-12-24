/**
 * Leetcode - sentence_similarity
 */
package com.algorithm.problems.sentence_similarity;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) return false;
        Map<String, String> map = new HashMap<>();
        for (String[] pair : pairs) {
            map.put(pair[0], pair[1]);
            map.put(pair[1], pair[0]);
        }
        for (int i = 0; i < words1.length; i++) {
            if (words1[i].equals(words2[i])) continue;
            if (!map.containsKey(words1[i]) || !words2[i].equals(map.get(words1[i]))) return false;
        }
        return true;
    }
}
