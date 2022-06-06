/**
 * Leetcode - letter_combinations_of_a_phone_number
 */
package com.algorithm.problems.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution1 implements Solution {

    private String[][] numLetters = new String[][]{{}, {}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"},
            {"m", "n", "o"}, {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};

    @Override
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        if (digits.length() == 1) return Arrays.stream(numLetters[digits.charAt(0) - '0']).collect(Collectors.toList());

        String[] letters = numLetters[digits.charAt(0) - '0'];
        List<String> subList = letterCombinations(digits.substring(1));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            for (String subStr : subList) list.add(letter + subStr);
        }
        return list;
    }
}
