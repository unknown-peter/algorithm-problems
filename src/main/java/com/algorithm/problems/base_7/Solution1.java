/**
 * Leetcode - base_7
 */
package com.algorithm.problems.base_7;

class Solution1 implements Solution {

    @Override
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int n = (num < 0) ? -num : num;
        while (n != 0) {
            sb.append(n % 7);
            n /= 7;
        }
        if (num < 0) sb.append('-');
        return sb.reverse().toString();
    }
}
