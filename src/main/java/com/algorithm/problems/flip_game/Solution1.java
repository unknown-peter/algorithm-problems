/**
 * Leetcode - flip_game
 */
package com.algorithm.problems.flip_game;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                list.add(s.substring(0, i - 1) + "--" + s.substring(i + 1));
            }
        }
        return list;
    }
}
