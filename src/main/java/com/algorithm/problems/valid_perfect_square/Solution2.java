/**
 * Leetcode - valid_perfect_square
 */
package com.algorithm.problems.valid_perfect_square;

class Solution2 implements Solution {

    /**
     * n^2 = 1 + 3 + 5 + ... + 2n-1
     */
    @Override
    public boolean isPerfectSquare(int num) {
        long square = 0;
        for (int i = 1; square <= num; i = i + 2) {
            if (square == num) return true;
            square += i;
        }
        return false;

//        int i = 1;
//        while (num > 0) {
//            num -= i;
//            i += 2;
//        }
//        return num == 0;

    }
}
