/**
 * Leetcode - integer_to_roman
 */
package com.algorithm.problems.integer_to_roman;

class Solution1 implements Solution {

    String[] digit1 = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    String[] digit2 = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

    String[] digit3 = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

    String[] digit4 = new String[] {"", "M", "MM", "MMM"};

    @Override
    public String intToRoman(int num) {
        int d4 = num / 1000;
        num %= 1000;
        int d3 = num / 100;
        num %= 100;
        int d2 = num / 10;
        num %= 10;
        int d1 = num;
        return digit4[d4] + digit3[d3] + digit2[d2] + digit1[d1];
    }
}
