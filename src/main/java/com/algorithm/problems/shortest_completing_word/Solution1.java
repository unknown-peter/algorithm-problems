/**
 * Leetcode - shortest_completing_word
 */
package com.algorithm.problems.shortest_completing_word;

class Solution1 implements Solution {

    @Override
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int minLength = Integer.MAX_VALUE;
        int[] licensePlateCount = new int[26];
        String result = null;
        char[] licensePlateArray = licensePlate.toLowerCase().toCharArray();
        for (char letter : licensePlateArray) {
            if (Character.isAlphabetic(letter)) licensePlateCount[letter - 'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            if (isCompletingWord(words[i], licensePlateCount) && words[i].length() < minLength) {
                minLength = Math.min(minLength, words[i].length());
                result = words[i];
            }
        }
        return result;
    }

    private boolean isCompletingWord(String word, int[] licensePlateCount) {
        int[] wordLetterCount = new int[26];
        for (char letter : word.toCharArray()) wordLetterCount[letter - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (wordLetterCount[i] < licensePlateCount[i]) return false;
        }
        return true;
    }
}
