/**
 * Leetcode - base_7
 */
package com.algorithm.problems.base_7;

class Solution2 implements Solution {

    @Override
    public String convertToBase7(int num) {
        if (num < 0) return "-" + convertToBase7(-num);
        if (num < 7) return String.valueOf(num);
        return convertToBase7(num / 7) + String.valueOf(num % 7);
    }
}
