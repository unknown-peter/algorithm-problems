/**
 * Leetcode - add_binary
 */
package com.algorithmproblems.add_binary;

class Solution1 implements Solution {

    @Override
    public String addBinary(String a, String b) {
        int aPointer = a.length() - 1;
        int bPointer = b.length() - 1;
        int cPointer = Math.max(a.length(), b.length());
        char[] c = new char[cPointer + 1];
        boolean isCarry = false;
        int tmp;

        while (aPointer >= 0 || bPointer >= 0) {
            if (aPointer >= 0 && bPointer >= 0) {
                tmp = Character.digit(a.charAt(aPointer), 2)
                        + Character.digit(b.charAt(bPointer), 2) + (isCarry ? 1 : 0);
                aPointer--;
                bPointer--;
            } else if (aPointer >= 0) {
                tmp = Character.digit(a.charAt(aPointer), 2) + (isCarry ? 1 : 0);
                aPointer--;
            } else {
                tmp = Character.digit(b.charAt(bPointer), 2) + (isCarry ? 1 : 0);
                bPointer--;
            }
            c[cPointer--] = Character.forDigit(tmp % 2, 2);
            isCarry = (tmp / 2 > 0) ? true : false;
        }
        if (isCarry) {
            c[0] = '1';
            return new String(c);
        } else {
            return new String(c, 1, c.length - 1);
        }
    }

}
