/**
 * Leetcode - two_sum
 */
package com.algorithmproblems.two_sum;

import java.util.HashMap;
import java.util.Map;


class Solution3 implements Solution {
    /**
     * 从HashMap中获取target-nums[i]的值
     * 使用HashMap存储数组 nums[i] -> i
     * 在同一循环遍历中进行操作
     * O(n)
     */
    @Override
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < len; i++) {
            Integer complementIndex = map.get(target - nums[i]);
            if ((null != complementIndex) && (!complementIndex.equals(i))) {
                return new int[] {complementIndex, i};
            }

            map.put(nums[i], i);
        }
        return null;
    }
}
