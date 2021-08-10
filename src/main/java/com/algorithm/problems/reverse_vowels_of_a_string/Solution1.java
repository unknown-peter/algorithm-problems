/**
 * Leetcode - reverse_vowels_of_a_string
 */
package com.algorithm.problems.reverse_vowels_of_a_string;

class Solution1 implements Solution {

    @Override
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] array = s.toCharArray();
        while (left < right) {
            while (left < right && !isVowel(array[left])) left++;
            while (left < right && !isVowel(array[right])) right--;
            if (left < right) {
                char tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(array);
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
