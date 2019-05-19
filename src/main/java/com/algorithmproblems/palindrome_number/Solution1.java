/**
 * Leetcode - palindrome_number
 */
package com.algorithmproblems.palindrome_number;

class Solution1 implements Solution {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int dividend = x;
        int xrev = 0;
        while (dividend != 0) {
            int remainder = dividend % 10;
            if (dividend < 10) {
                xrev += remainder;
            } else {
                xrev = (xrev + remainder) * 10;
                if (xrev < 0)
                    return false;
            }
            dividend /= 10;
        }
        if (x == xrev)
            return true;
        else
            return false;
    }

}
