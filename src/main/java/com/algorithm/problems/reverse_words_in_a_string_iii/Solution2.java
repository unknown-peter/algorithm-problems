/**
 * Leetcode - reverse_words_in_a_string_iii
 */
package com.algorithm.problems.reverse_words_in_a_string_iii;

class Solution2 implements Solution {

    /**
     * s转成char数组，对于char数组中每个空格之前的单词char首尾互换位置
     */
    @Override
    public String reverseWords(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        while (i < array.length) {
            int l = i;
            int h = i;
            while (h < array.length && array[h] != ' ') h++;
            i = h + 1;
            h--;
            while (l < h) {
                char tmp = array[l];
                array[l++] = array[h];
                array[h--] = tmp;
            }
        }
        return new String(array);
    }
}
