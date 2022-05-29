/**
 * Leetcode - string_to_integer_atoi
 */
package com.algorithm.problems.string_to_integer_atoi;

class Solution1 implements Solution {

    @Override
    public int myAtoi(String s) {
        boolean negative = false;
        int res = 0;
        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') negative = true;
            i++;
        }
        for (; i < n; i++) {
            if (!Character.isDigit(s.charAt(i))) break;
            int tmp = s.charAt(i) - '0';
            if (negative) {
                if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && tmp >= 8))
                    return Integer.MIN_VALUE;
                res = res * 10 - tmp;
            } else {
                if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && tmp >= 7))
                    return Integer.MAX_VALUE;
                res = res * 10 + tmp;
            }
        }
        return res;
    }

//    public int myAtoi(String input) {
//        int sign = 1;
//        int result = 0;
//        int index = 0;
//        int n = input.length();
//
//        // Discard all spaces from the beginning of the input string.
//        while (index < n && input.charAt(index) == ' ') {
//            index++;
//        }
//
//        // sign = +1, if it's positive number, otherwise sign = -1.
//        if (index < n && input.charAt(index) == '+') {
//            sign = 1;
//            index++;
//        } else if (index < n && input.charAt(index) == '-') {
//            sign = -1;
//            index++;
//        }
//
//        // Traverse next digits of input and stop if it is not a digit
//        while (index < n && Character.isDigit(input.charAt(index))) {
//            int digit = input.charAt(index) - '0';
//
//            // Check overflow and underflow conditions.
//            if ((result > Integer.MAX_VALUE / 10) ||
//                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
//                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.
//                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//            }
//
//            // Append current digit to the result.
//            result = 10 * result + digit;
//            index++;
//        }
//
//        // We have formed a valid number without any overflow/underflow.
//        // Return it after multiplying it with its sign.
//        return sign * result;
//    }
}
