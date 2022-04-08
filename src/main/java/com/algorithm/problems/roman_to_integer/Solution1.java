/**
 * Leetcode - roman_to_integer
 */
package com.algorithm.problems.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    Map<Character, Integer> romans = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    /**
     * 从右至左依次遍历字符串中的罗马数字，当前数字大于上一个数字，加该数字值；当前数字小于
     * 上一个数字且两数字相差在10倍以内，减当前数字值。
     */
    @Override
    public int romanToInt(String s) {
        int romanInt = 0;
        int pre = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!romans.containsKey(s.charAt(i))) return -1;
            int romanValue = romans.get(s.charAt(i));
            if (romanValue >= pre)
                romanInt += romanValue;
            else if (romanValue * 10 >= pre)
                romanInt -= romanValue;
            else return -1;
            pre = romanValue;
        }
        return romanInt;
    }

}
