/**
 * Leetcode - shortest_completing_word
 */
package com.algorithm.problems.shortest_completing_word;

class Solution1 implements Solution {

    @Override
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int minLength = Integer.MAX_VALUE;
        int[] letterCount = new int[26];
        int[] wordLength = new int[words.length];

        for (char letter : licensePlate.toCharArray()) {
            if (Character.isAlphabetic(letter)) letterCount[Character.toLowerCase(letter) - 'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            int[] wordLetterCount = new int[26];
            for (char letter : words[i].toCharArray()) {
                wordLetterCount[Character.toLowerCase(letter) - 'a']++;
            }
            int j = 0;
            for (; j < 26; j++) {
                if (wordLetterCount[j] < letterCount[j]) break;
            }
            if (j == 26) {
                wordLength[i] = words[i].length();
                minLength = Math.min(minLength, wordLength[i]);
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (wordLength[i] == minLength) return words[i];
        }
        return "";
    }
}
