/**
 * Leetcode - rotate_string
 */
package com.algorithm.problems.rotate_string;

import java.util.Arrays;

class Solution1 implements Solution {

    @Override
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        char[] sArray = s.toCharArray();
        char[] gArray = goal.toCharArray();
        int n = gArray.length;
        char tmp;
        for (int i = 0; i < n; i++) {
            if (Arrays.equals(sArray, gArray)) return true;
            tmp = gArray[0];
            System.arraycopy(gArray, 1, gArray, 0, n - 1);
            gArray[n - 1] = tmp;
        }
        return false;
    }
}
