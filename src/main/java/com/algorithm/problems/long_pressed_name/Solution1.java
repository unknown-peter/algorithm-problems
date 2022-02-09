/**
 * Leetcode - long_pressed_name
 */
package com.algorithm.problems.long_pressed_name;

class Solution1 implements Solution {

    @Override
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();
        int i = 0;
        int j = 0;
        int cnt1;
        int cnt2;
        while (i < m && j < n) {
            cnt1 = 0;
            cnt2 = 0;
            char ch = name.charAt(i);
            if (ch != typed.charAt(j)) return false;
            while (i < m && name.charAt(i) == ch) {
                i++;
                cnt1++;
            }
            while (j < n && typed.charAt(j) == ch) {
                j++;
                cnt2++;
            }
            if (cnt1 > cnt2) return false;
        }
        return (i == m && j == n);
    }
}
