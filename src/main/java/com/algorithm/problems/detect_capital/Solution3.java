/**
 * Leetcode - detect_capital
 */
package com.algorithm.problems.detect_capital;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|.[a-z]*");
    }
}
