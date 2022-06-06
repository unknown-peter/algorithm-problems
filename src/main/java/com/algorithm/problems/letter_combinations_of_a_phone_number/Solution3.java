/**
 * Leetcode - letter_combinations_of_a_phone_number
 */
package com.algorithm.problems.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;

class Solution3 implements Solution {

    private Character[][] numLetters = new Character[][]{{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    /**
     * 深度优先搜索逐层向下，每层遍历设置该层的字符，直到最后添加到结果中
     */
    @Override
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();

        char[] arr = new char[digits.length()];
        List<String> res = new ArrayList<>();

        dfs(digits, 0, arr, res);
        return res;
    }

    private void dfs(String digits, int level, char[] arr, List<String> res) {
        if (level == digits.length()) {
            res.add(new String(arr));
            return;
        }

        Character[] letters = numLetters[digits.charAt(level) - '0'];
        for (Character letter : letters) {
            arr[level] = letter;
            dfs(digits, level + 1, arr, res);
        }
    }
}
