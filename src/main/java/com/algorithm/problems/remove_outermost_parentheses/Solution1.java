/**
 * Leetcode - remove_outermost_parentheses
 */
package com.algorithm.problems.remove_outermost_parentheses;

class Solution1 implements Solution {

    /**
     * 定义计数器count，当为'('时计数器加1，为')'时计数器减一
     * '('加1之前若count为0，则说明当前'('是外层的'('
     * ')'减1之后若count为0，则说明当前')'是外层的')'
     */
    @Override
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) sb.append(ch);
                count++;
            } else {
                count--;
                if (count > 0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}
