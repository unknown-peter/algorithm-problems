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
            int complement = target - nums[i];
            // 查找HashMap中是否已存有target-nums[i]的index值
            // 此时nums[i]还未存储到HashMap，结果不会是同一个index的数字
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return null;
    }
}
