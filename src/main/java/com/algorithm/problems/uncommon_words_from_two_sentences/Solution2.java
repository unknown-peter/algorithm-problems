/**
 * Leetcode - uncommon_words_from_two_sentences
 */
package com.algorithm.problems.uncommon_words_from_two_sentences;

import java.util.HashSet;
import java.util.Set;

class Solution2 implements Solution {

    @Override
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> allSet = new HashSet<>();
        Set<String> uncommonSet = new HashSet<>();
        for (String word : s1.split(" ")) {
            if (allSet.add(word)) uncommonSet.add(word);
            else uncommonSet.remove(word);
        }
        for (String word : s2.split(" ")) {
            if (allSet.add(word)) uncommonSet.add(word);
            else uncommonSet.remove(word);
        }
        return uncommonSet.toArray(new String[0]);
    }
}
