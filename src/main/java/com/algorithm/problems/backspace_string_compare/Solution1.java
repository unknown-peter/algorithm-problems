/**
 * Leetcode - backspace_string_compare
 */
package com.algorithm.problems.backspace_string_compare;

class Solution1 implements Solution {

    @Override
    public boolean backspaceCompare(String s, String t) {
        char[] sArray = new char[200];
        char[] tArray = new char[200];
        int i = 0;
        int j = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (i != 0) i--;
            } else sArray[i++] = ch;
        }
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (j != 0) j--;
            } else tArray[j++] = ch;
        }
        if (i != j) return false;
        for (int k = 0; k < i; k++) {
            if (sArray[k] != tArray[k]) return false;
        }
        return true;
    }
}
