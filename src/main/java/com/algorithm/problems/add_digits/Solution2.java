/**
 * Leetcode - add_digits
 */
package com.algorithm.problems.add_digits;

class Solution2 implements Solution {

    @Override
    public int addDigits(int num) {
        if (num == 0) return 0;
        int r = num % 9;
        return (r == 0) ? 9 : r;

//        if (num == 0) return 0;
//        if (num % 9 == 0) return 9;
//        return num % 9;

//        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
