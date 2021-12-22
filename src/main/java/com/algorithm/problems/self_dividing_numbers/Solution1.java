/**
 * Leetcode - self_dividing_numbers
 */
package com.algorithm.problems.self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDivided(i)) res.add(i);
        }
        return res;
    }

    private boolean isSelfDivided(int num) {
        int tmp = num;
        while (tmp > 0) {
            int digit = tmp % 10;
            if (digit == 0 || (num % digit != 0)) return false;
            tmp /= 10;
        }
        return true;
    }
}
