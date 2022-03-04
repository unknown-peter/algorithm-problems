/**
 * Leetcode - binary_prefix_divisible_by_5
 */
package com.algorithm.problems.binary_prefix_divisible_by_5;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    /**
     * 当前数为x，则下一个数为2x或2x+1
     * 根据求余性质，保存每次计算之后对5取余的结果
     */
    @Override
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int curNum = 0;
        for (int num : nums) {
            curNum = ((curNum << 1) + num) % 5;
            list.add(curNum == 0);
        }
        return list;
    }
}
