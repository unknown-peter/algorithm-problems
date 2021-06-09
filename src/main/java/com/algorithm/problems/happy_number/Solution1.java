/**
 * Leetcode - happy_number
 */
package com.algorithm.problems.happy_number;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public boolean isHappy(int n) {
        Set<Integer> numSet = new HashSet<>();
        int tmp = 0;

        while (true) {
            if (numSet.contains(n)) return false;
            numSet.add(n);
            while (n != 0) {
                tmp += (n % 10) * (n % 10);
                n /= 10;
            }
            if (tmp == 1) return true;
            n = tmp;
            tmp = 0;
        }
    }
}
