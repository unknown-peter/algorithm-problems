/**
 * Leetcode - generate_parentheses
 */
package com.algorithm.problems.generate_parentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution1 implements Solution {

    @Override
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        char[] arr = new char[2 * n];
        dfs(0, 0, n, arr, list);
        return list;
    }

    private void dfs(int lDep, int rDep, int n, char[] arr, List<String> list) {
        if (lDep == n && rDep == n) {
            if (isValid(arr)) list.add(new String(arr));
            return;
        }

        if (lDep < n) {
            arr[lDep + rDep] = '(';
            dfs(lDep + 1, rDep, n, arr, list);
        }
        if (rDep < n) {
            arr[lDep + rDep] = ')';
            dfs(lDep, rDep + 1, n, arr, list);
        }
    }

    private boolean isValid(char[] arr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : arr) {
            if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            } else if (ch == '(') {
                stack.push('(');
            }
        }
        return stack.isEmpty();
    }
}
