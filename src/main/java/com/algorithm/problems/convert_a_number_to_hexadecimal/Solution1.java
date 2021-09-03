/**
 * Leetcode - convert_a_number_to_hexadecimal
 */
package com.algorithm.problems.convert_a_number_to_hexadecimal;

class Solution1 implements Solution {

    private String hexString = "0123456789abcdef";

    @Override
    public String toHex(int num) {
        StringBuilder hex = new StringBuilder();
        if (num == 0) return "0";
        while (num != 0) {
            hex.insert(0, hexString.charAt(num & 0x0000000f));
            num >>>= 4;
        }

        return hex.toString();
    }
}
