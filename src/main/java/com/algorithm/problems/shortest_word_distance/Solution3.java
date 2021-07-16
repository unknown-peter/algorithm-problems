/**
 * Leetcode - shortest_word_distance
 */
package com.algorithm.problems.shortest_word_distance;

import java.util.ArrayList;
import java.util.List;

class Solution3 implements Solution {

    @Override
    public int shortestDistance(String[] words, String word1, String word2) {
        List<Integer> word1Indexs = new ArrayList<>();
        List<Integer> word2Indexs = new ArrayList<>();
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (word1.equals(words[i])) word1Indexs.add(i);
            if (word2.equals(words[i])) word2Indexs.add(i);
        }

        for (Integer word1Index : word1Indexs) {
            for (Integer word2Index : word2Indexs) {
                distance = Math.min(distance, Math.abs(word2Index - word1Index));
            }
        }
        return distance;
    }
}
