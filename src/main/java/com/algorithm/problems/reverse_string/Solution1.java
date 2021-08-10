/**
 * Leetcode - reverse_string
 */
package com.algorithm.problems.reverse_string;

class Solution1 implements Solution {

    @Override
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
