/**
 * Leetcode - reverse_words_in_a_string_iii
 */
package com.algorithm.problems.reverse_words_in_a_string_iii;

class Solution1 implements Solution {

    /**
     * 将s拆分成word数组，从后向前将word存到StringBuilder中
     * 翻转StringBuilder即可
     */
    @Override
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).reverse().toString();
    }
}
