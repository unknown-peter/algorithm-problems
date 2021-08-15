/**
 * Leetcode - valid_perfect_square
 */
package com.algorithm.problems.valid_perfect_square;

class Solution1 implements Solution {

    @Override
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num / i; i++) {
            if (i * i == num) return true;
        }
        return false;
    }
}
