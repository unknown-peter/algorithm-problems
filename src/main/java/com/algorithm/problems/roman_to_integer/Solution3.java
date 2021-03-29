/**
 * Leetcode - roman_to_integer
 */
package com.algorithm.problems.roman_to_integer;

import java.util.Arrays;
import java.util.List;

class Solution3 implements Solution {

    enum Roman {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(
                1000);
        private int value;

        Roman(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<Roman> getDescendant() {
            Roman[] lists = Roman.values();
            List<Roman> roman = Arrays.asList(lists);
            roman.sort((o1, o2) -> o2.getValue() - o1.getValue());
            return roman;
        }
    }

    /**
     * solution from leetcode
     * 将所有可能的罗马数字码从大到小排列，遍历该列表并与字符串起始作比较，
     * 如果相等则加上对应的码值并去掉字符串起始；否则继续比较下一个罗马数字码
     */
    @Override
    public int romanToInt(String s) {
        List<Roman> roman = Roman.getDescendant();
        int result = 0;
        int i = 0;
        while (i < roman.size()) {
            if (s.startsWith(roman.get(i).name())) {
                result += roman.get(i).getValue();
                s = s.substring(roman.get(i).name().length());
            } else {
                i++;
            }
        }

        return result;
    }
}
