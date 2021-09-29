/**
 * Leetcode - number_complement
 */
package com.algorithm.problems.number_complement;

class Solution1 implements Solution {

    @Override
    public int findComplement(int num) {
        int res = 0;
        int multiplier = 1;
        while (num != 0) {
            res += multiplier * ((num ^ 1) & 1);
            multiplier *= 2;
            num >>= 1;
        }
        return res;
    }
}
