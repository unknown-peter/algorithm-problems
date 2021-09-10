/**
 * Leetcode - valid_word_square
 */
package com.algorithm.problems.valid_word_square;

import java.util.List;

class Solution1 implements Solution {

    @Override
    public boolean validWordSquare(List<String> words) {
        if (words == null) return true;
        if (words.size() != words.get(0).length()) return false;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if ((j >= words.size()) || (i >= words.get(j).length()) || (words.get(i).charAt(j) != words.get(j).charAt(i)))
                    return false;
            }
        }
        return true;
    }
}
