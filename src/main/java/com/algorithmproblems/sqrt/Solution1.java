/**
 * Leetcode - sqrt
 */
package com.algorithmproblems.sqrt;

class Solution1 implements Solution {

    @Override
    public int mySqrt(int x) {
        if (x < 0)
            throw new RuntimeException("invalid parameter");
        if (x == 0)
            return 0;

        int l = 1;
        int h = x;
        while (l < h - 1) {
            int mid = l + (h - l) / 2;
            if (mid == x / mid)
                return mid;
            else if (mid < x / mid)
                l = mid;
            else
                h = mid;
        }

        return l;
    }

}