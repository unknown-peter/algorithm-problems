/**
 * Leetcode - strobogrammatic_number
 */
package com.algorithm.problems.strobogrammatic_number;

class Solution1 implements Solution {

    @Override
    public boolean isStrobogrammatic(String num) {
        int i = 0;
        int j = num.length() - 1;
        while (i <= j) {
            if (num.charAt(i) == num.charAt(j)) {
                if (num.charAt(i) != '0' && num.charAt(i) != '1' && num.charAt(i) != '8') return false;
            } else {
                if ((num.charAt(i) == '6' && num.charAt(j) != '9')
                        || (num.charAt(i) == '9' && num.charAt(j) != '6'))
                    return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
