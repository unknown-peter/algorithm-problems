/**
 * Leetcode - strobogrammatic_number
 */
package com.algorithm.problems.strobogrammatic_number;

class Solution1 implements Solution {

    @Override
    public boolean isStrobogrammatic(String num) {
        int len = num.length();
        for (int i = 0; i < len / 2; i++) {
            if ((num.charAt(i) == '6' && num.charAt(len - i - 1) != '9')
                    || (num.charAt(i) == '9' && num.charAt(len - i - 1) != '6')
                    || (num.charAt(i) == '0' && num.charAt(len - i - 1) != '0')
                    || (num.charAt(i) == '1' && num.charAt(len - i - 1) != '1')
                    || (num.charAt(i) == '8' && num.charAt(len - i - 1) != '8'))
                return false;
        }
        return true;
    }
}
