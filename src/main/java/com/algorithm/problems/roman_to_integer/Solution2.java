/**
 * Leetcode - roman_to_integer
 */
package com.algorithm.problems.roman_to_integer;

class Solution2 implements Solution {

    @Override
    public int romanToInt(String s) {
        int romanInt = 0;
        int pre = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int romanValue;
            switch (s.charAt(i)) {
                case 'I':
                    romanValue = 1;
                    break;
                case 'V':
                    romanValue = 5;
                    break;
                case 'X':
                    romanValue = 10;
                    break;
                case 'L':
                    romanValue = 50;
                    break;
                case 'C':
                    romanValue = 100;
                    break;
                case 'D':
                    romanValue = 500;
                    break;
                case 'M':
                    romanValue = 1000;
                    break;
                default:
                    throw new RuntimeException("not roman symbol");
            }
            if (romanValue >= pre)
                romanInt += romanValue;
            else if (romanValue * 10 >= pre)
                romanInt -= romanValue;
            else
                throw new RuntimeException("wrong roman symbol order");
            pre = romanValue;
        }
        return romanInt;
    }
}
