/**
 * Leetcode - long_pressed_name
 */
package com.algorithm.problems.long_pressed_name;

class Solution2 implements Solution {

    @Override
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) return false;
                j++;
            }
        }
        if (i < m) return false;
        while (j < n) {
            if (typed.charAt(j) != typed.charAt(j - 1)) return false;
            j++;
        }
        return true;
    }
}
