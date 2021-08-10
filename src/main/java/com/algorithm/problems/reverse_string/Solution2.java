/**
 * Leetcode - reverse_string
 */
package com.algorithm.problems.reverse_string;

class Solution2 implements Solution {

    @Override
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}
