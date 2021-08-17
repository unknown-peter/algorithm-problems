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
        int left = 1;
        int right = n;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int result = guess(middle);
            if (result == 0) return middle;
            if (result == -1) right = middle - 1;
            else if (result == 1) left = middle + 1;
        }
        return -1;
    }

    private int guess(int num) {
        return Integer.compare(pick, num);
    }
}
