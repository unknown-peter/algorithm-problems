/**
 * Leetcode - ugly_number
 */
package com.algorithm.problems.ugly_number;

class Solution1 implements Solution {

    @Override
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int remain2;
        int remain3;
        int remain5;
        while (n > 1) {
            remain2 = n % 2;
            remain3 = n % 3;
            remain5 = n % 5;
            if (remain2 != 0 && remain3 != 0 && remain5 != 0) return false;
            if (remain2 == 0) n /= 2;
            if (remain3 == 0) n /= 3;
            if (remain5 == 0) n /= 5;
        }
        return n == 1;
    }
}
