/**
 * Leetcode - reverse_only_letters
 */
package com.algorithm.problems.reverse_only_letters;

class Solution1 implements Solution {

    @Override
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] array = s.toCharArray();
        while (i < j) {
            while (i < j && !Character.isLetter(array[i])) i++;
            while (i < j && !Character.isLetter(array[j])) j--;
            if (i < j) {
                char tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(array);
    }
}
