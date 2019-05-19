/**
 * Leetcode - reverse_integer
 */
package com.algorithmproblems.reverse_integer;

class Solution1 implements Solution {

    @Override
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE)
            return 0;

        int dividend = x;
        long xrev = 0;
        while (dividend != 0) {
            int remainder = dividend % 10;
            if (Math.abs(dividend) < 10) {
                xrev += remainder;
            } else {
                xrev = (xrev + remainder) * 10L;
                if ((xrev > Integer.MAX_VALUE) || (xrev < Integer.MIN_VALUE))
                    return 0;
            }
            dividend /= 10;
        }

        return (int) xrev;
    }

}
