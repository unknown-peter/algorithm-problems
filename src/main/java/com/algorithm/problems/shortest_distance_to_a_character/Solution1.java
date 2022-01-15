/**
 * Leetcode - shortest_distance_to_a_character
 */
package com.algorithm.problems.shortest_distance_to_a_character;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public int[] shortestToChar(String s, char c) {
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        int cur = -10000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                list.add(new Pair<>(cur, i));
                cur = i;
            }
        }
        list.add(new Pair<>(cur, 10000));

        int j = 0;
        Pair<Integer, Integer> interval = list.get(j);
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == interval.getValue()) {
                interval = list.get(++j);
            }
            res[i] = Math.min(i - interval.getKey(), interval.getValue() - i);
        }
        return res;
    }
}
