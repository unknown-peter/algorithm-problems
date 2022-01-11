/**
 * Leetcode - unique_morse_code_words
 */
package com.algorithm.problems.unique_morse_code_words;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    private String[] alphabetMorse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    @Override
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1) return 1;

        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                sb.append(alphabetMorse[ch - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
