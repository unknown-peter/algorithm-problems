/**
 * Leetcode - binary_prefix_divisible_by_5
 */
package com.algorithm.problems.binary_prefix_divisible_by_5;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        long curNum = 0;
        for (int num : nums) {
            curNum = (curNum << 1) + num;
            if (curNum % 5 == 0) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
