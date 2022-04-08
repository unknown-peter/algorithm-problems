/**
 * Leetcode - valid_parentheses
 */
package com.algorithm.problems.valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution1 implements Solution {

    Map<Character, Character> bracketPair = new HashMap<Character, Character>() {
        {
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }
    };

    /**
     * 遍历字符串，左半边括号存入栈，右半边括号判断是否和出栈的括号匹配
     */
    @Override
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    brackets.push(s.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    // 栈内无元素 或 出栈左括号与当前右括号不匹配
                    if (brackets.empty() || !bracketPair.get(brackets.pop()).equals(s.charAt(i)))
                        return false;
                    break;
                default:
                    return false;
            }
        }
        return brackets.empty();
    }

}
