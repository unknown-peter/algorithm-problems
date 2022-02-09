/**
 * Leetcode - long_pressed_name
 */
package com.algorithm.problems.long_pressed_name;

class Solution3 implements Solution {

    @Override
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (i < m && name.charAt(i) == typed.charAt(j)) i++;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) return false;
        }
        return i == m;
    }
}
