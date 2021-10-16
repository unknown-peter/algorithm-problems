/**
 * Leetcode - reverse_string_ii
 */
package com.algorithm.problems.reverse_string_ii;

class Solution1 implements Solution {

    @Override
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int round = 0;

        for (int i = 0; i < s.length(); i++) {
            if (count < Math.abs(k)) {
                if (k > 0) sb.insert(round * k, s.charAt(i));
                else sb.append(s.charAt(i));
            }
            count++;

            if (count == Math.abs(k)) {
                count = 0;
                k = -k;
                round++;
            }
        }
        return sb.toString();
    }
}
