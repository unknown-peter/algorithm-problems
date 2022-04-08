/**
 * Leetcode - two_sum
 */
package com.algorithm.problems.two_sum;

import java.util.HashMap;
import java.util.Map;


class Solution2 implements Solution {

    /**
     * 使用HashMap存储数组 nums[i] -> i
     * 循环遍历数组，对数组i位置的nums[i]，获取target-nums[i]在HashMap中的值j，返回(i, j)
     * O(n)
     */
    @Override
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < len; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < len; i++) {
            Integer complementIndex = map.get(target - nums[i]);
            // 结果不能是同一个index的数字
            if ((null != complementIndex) && (!complementIndex.equals(i))) {
                return new int[] {i, complementIndex};
            }
        }
        return null;
    }
}
