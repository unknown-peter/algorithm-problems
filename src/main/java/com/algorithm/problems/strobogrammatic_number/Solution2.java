/**
 * Leetcode - strobogrammatic_number
 */
package com.algorithm.problems.strobogrammatic_number;

import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    @Override
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put('0', '0');
                put('1', '1');
                put('8', '8');
                put('6', '9');
                put('9', '6');
            }
        };
        int len = num.length();
        for (int i = 0; i <= len / 2; i++) {
            Character ch = map.get(num.charAt(i));
            if (ch == null || !ch.equals(num.charAt(len - 1 - i))) return false;
        }
        return true;
    }
}
