/**
 * Leetcode - add_digits
 */
package com.algorithm.problems.add_digits;

class Solution1 implements Solution {

    @Override
    public int addDigits(int num) {
        while (num > 9) {
            int addNum = 0;
            while (num != 0) {
                addNum += num % 10;
                num /= 10;
            }
            num = addNum;
        }
        return num;

//        int digitalRoot = 0;
//        while (num > 0) {
//            digitalRoot += num % 10;
//            num = num / 10;
//
//            if (num == 0 && digitalRoot > 9) {
//                num = digitalRoot;
//                digitalRoot = 0;
//            }
//        }
//        return digitalRoot;
    }
}
