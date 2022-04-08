/**
 * Leetcode - plus_one
 */
package com.algorithm.problems.plus_one;

import java.util.Arrays;

class Solution1 implements Solution {

    @Override
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return new int[0];

        int[] plusOne = new int[digits.length + 1];
        System.arraycopy(digits, 0, plusOne, 1, digits.length);
        // 末位是9进位
        if (digits[digits.length - 1] == 9) {
            int i;
            for (i = digits.length - 1; i >= 0; i--) {
                if (digits[i] != 9)
                    break;
                plusOne[i + 1] = 0;
            }
            if (i == -1) {
                plusOne[0] = 1;
                return plusOne;
            } else {
                plusOne[i + 1] = digits[i] + 1;
            }
        } else {
            plusOne[digits.length] = digits[digits.length - 1] + 1;
        }
        return Arrays.copyOfRange(plusOne, 1, plusOne.length);
    }

}
