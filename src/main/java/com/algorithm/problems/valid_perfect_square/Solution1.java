/**
 * Leetcode - valid_perfect_square
 */
package com.algorithm.problems.valid_perfect_square;

class Solution1 implements Solution {

    @Override
    public boolean isPerfectSquare(int num) {
        int i = 1;
        int square;
        while ((square = i * i) <= num) {
            if (square == num) return true;
            i++;
        }
        return false;
    }
}
