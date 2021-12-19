/**
 * Leetcode - to_lower_case
 */
package com.algorithm.problems.to_lower_case;

class Solution2 implements Solution {

    @Override
    public String toLowerCase(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] = (char) ('a' + (array[i] - 'A'));
            }
        }
        return new String(array);
    }
}
