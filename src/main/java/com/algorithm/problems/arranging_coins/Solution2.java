/**
 * Leetcode - arranging_coins
 */
package com.algorithm.problems.arranging_coins;

class Solution2 implements Solution {

    @Override
    public int arrangeCoins(int n) {
        int l = 1;
        int h = n;
        int num = 0;
        while (l <= h) {
            int tmp = l + (h - l) / 2;
            if ((long) tmp * (tmp + 1) / 2 == n) return tmp;
            if ((long) tmp * (tmp + 1) / 2 < n) {
                num = tmp;
                l = tmp + 1;
            } else h = tmp - 1;
        }
        return num;

//        long left = 0, right = n;
//        long k, curr;
//        while (left <= right) {
//            k = left + (right - left) / 2;
//            curr = k * (k + 1) / 2;
//
//            if (curr == n) return (int)k;
//
//            if (n < curr) {
//                right = k - 1;
//            } else {
//                left = k + 1;
//            }
//        }
//        return (int)right;
    }
}
