/**
 * Leetcode - detect_capital
 */
package com.algorithm.problems.detect_capital;

class Solution1 implements Solution {

    @Override
    public boolean detectCapitalUse(String word) {
        int type = 0;
        if (Character.isLowerCase(word.charAt(0))) {
            if (Character.isLowerCase(word.charAt(word.length() - 1))) type = 1;
            else return false;
        } else {
            type = (Character.isLowerCase(word.charAt(word.length() - 1))) ? 2 : 3;
        }

        for (int i = 1; i < word.length(); i++) {
            if ((type == 1 || type == 2) && !Character.isLowerCase(word.charAt(i))) return false;
            if (type == 3 && !Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
}
