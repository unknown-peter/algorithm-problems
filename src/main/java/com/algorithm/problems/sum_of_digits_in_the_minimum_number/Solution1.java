/**
 * Leetcode - sum_of_digits_in_the_minimum_number
 */
package com.algorithm.problems.sum_of_digits_in_the_minimum_number;

class Solution1 implements Solution {

    @Override
    public int sumOfDigits(int[] A) {
        int minNum = Integer.MAX_VALUE;
        for (int num : A) {
            if (minNum > num) minNum = num;
        }
        int sum = 0;
        while (minNum > 0) {
            sum += minNum % 10;
            minNum /= 10;
        }
        return 1 - (sum & 1);
    }
}
