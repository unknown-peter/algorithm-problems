/**
 * Leetcode - guess_number_higher_or_lower
 */
package com.algorithm.problems.guess_number_higher_or_lower;

class Solution1 implements Solution {

    private int pick;

    @Override
    public void setPick(int pick) {
        this.pick = pick;
    }

    @Override
    public int guessNumber(int n) {
        for (int i = 1; i <= n; i++)
            if (guess(i) == 0) return i;
        return -1;
    }

    private int guess(int num) {
        return Integer.compare(pick, num);
    }
}
