/**
 * Leetcode - confusing_number
 */
package com.algorithm.problems.confusing_number;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    private Map<Integer, Integer> map = new HashMap<Integer, Integer>() {
        {
            put(0, 0);
            put(1, 1);
            put(6, 9);
            put(8, 8);
            put(9, 6);
        }
    };

    @Override
    public boolean confusingNumber(int N) {
        int num = N;
        int rotateNum = 0;

        while (num != 0) {
            int remain = num % 10;
            Integer rotateDigit = map.get(remain);
            if (rotateDigit == null) return false;
            rotateNum = 10 * rotateNum + rotateDigit;
            num /= 10;
        }
        return rotateNum != N;
    }
}
