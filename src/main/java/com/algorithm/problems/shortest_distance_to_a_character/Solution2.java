/**
 * Leetcode - shortest_distance_to_a_character
 */
package com.algorithm.problems.shortest_distance_to_a_character;

class Solution2 implements Solution {

    @Override
    public int[] shortestToChar(String s, char c) {
        int cur = -10000;
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) cur = i;
            res[i] = i - cur;
        }
        cur = 10000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) cur = i;
            res[i] = Math.min(res[i], cur - i);
        }
        return res;
    }
}
