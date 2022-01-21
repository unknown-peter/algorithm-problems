/**
 * Leetcode - backspace_string_compare
 */
package com.algorithm.problems.backspace_string_compare;

import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public boolean backspaceCompare(String s, String t) {
        return parseStr(s).equals(parseStr(t));
    }

    private String parseStr(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch != '#') stack.push(ch);
            else if (!stack.isEmpty()) stack.pop();
        }
        return String.valueOf(stack);
    }
}
