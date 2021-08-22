/**
 * Leetcode - find_the_difference
 */
package com.algorithm.problems.find_the_difference;

class Solution2 implements Solution {

    @Override
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (char ch : s.toCharArray()) {
            result ^= ch;
        }
        for (char ch : t.toCharArray()) {
            result ^= ch;
        }
        return result;
    }
}
