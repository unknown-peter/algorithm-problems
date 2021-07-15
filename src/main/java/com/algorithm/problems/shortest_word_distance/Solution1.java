/**
 * Leetcode - shortest_word_distance
 */
package com.algorithm.problems.shortest_word_distance;

class Solution1 implements Solution {

    @Override
    public int shortestDistance(String[] words, String word1, String word2) {
        int word1Pos = -1;
        int word2Pos = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) word1Pos = i;
            if (words[i].equals(word2)) word2Pos = i;
            if (word1Pos != -1 && word2Pos != -1) distance = Math.min(distance, Math.abs(word1Pos - word2Pos));
        }
        return distance;
    }
}
