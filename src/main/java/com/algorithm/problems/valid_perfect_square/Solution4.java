/**
 * Leetcode - valid_perfect_square
 */
package com.algorithm.problems.valid_perfect_square;

class Solution4 implements Solution {

    @Override
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}
