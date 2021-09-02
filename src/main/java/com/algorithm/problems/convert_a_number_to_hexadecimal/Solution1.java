/**
 * Leetcode - convert_a_number_to_hexadecimal
 */
package com.algorithm.problems.convert_a_number_to_hexadecimal;

class Solution1 implements Solution {

    private char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @Override
    public String toHex(int num) {
        StringBuilder hex = new StringBuilder();
        if (num == 0) return "0";
        while (num != 0) {
            hex.insert(0, hexArray[num & 0x0000000f]);
            num >>>= 4;
        }

        return hex.toString();
    }
}
