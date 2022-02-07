/**
 * Leetcode - reverse_only_letters
 */
package com.algorithm.problems.reverse_only_letters;

import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) stack.push(ch);
        }
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) array[i] = stack.pop();
            else array[i] = s.charAt(i);
        }
        return new String(array);
    }
}
