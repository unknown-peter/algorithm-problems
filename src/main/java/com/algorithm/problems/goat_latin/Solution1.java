/**
 * Leetcode - goat_latin
 */
package com.algorithm.problems.goat_latin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    private Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    @Override
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder postfix = new StringBuilder();
        for (String word : words) {
            if (set.contains(word.charAt(0))) {
                sb.append(word).append("ma");
            } else {
                sb.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            postfix.append('a');
            sb.append(postfix.toString()).append(' ');
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
