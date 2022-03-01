/**
 * Leetcode - number_complement
 */
package com.algorithm.problems.number_complement;

class Solution2 implements Solution {

    @Override
    public int findComplement(int num) {
        if (num == 0) return 1;
        int mask = Integer.MAX_VALUE;
        while ((mask & num) != 0) mask <<= 1;
        return ~mask & ~num;

//        int leadingZeroNum = 0;
//        int res = (~num) & 0x7FFFFFFF;
//        while ((num & 0x80000000) != 0x80000000) {
//            leadingZeroNum++;
//            num <<= 1;
//        }
//        res = res & (0xFFFFFFFF >>> leadingZeroNum);
//        return res;
    }
}
