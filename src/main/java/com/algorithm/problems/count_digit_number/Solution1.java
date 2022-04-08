/**
 * Leetcode - count_digit_number
 */
package com.algorithm.problems.count_digit_number;

class Solution1 implements Solution {

    @Override
    public int count(int num, int digit, boolean isOdd) {
        if ((num < 0) || (digit < 0) || (digit > 9)) return -1;

        int i = isOdd ? 1 : 0;
        int count = 0;
        for (; i <= num; i += 2) {
            int number = i;
            while (number > 0) {
                int numDigit = number % 10;
                if (numDigit == digit) {
                    count++;
                }
                number /= 10;
            }
        }
        return count;
    }

}
