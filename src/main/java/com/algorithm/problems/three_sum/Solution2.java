/**
 * Leetcode - three_sum
 */
package com.algorithm.problems.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 implements Solution {

    /**
     * 对数组nums排序，然后遍历数组，对每个位置从其后一个元素和末尾元素向中间集中，和为零则添加到结果中。如果有相同的数则跳过
     */
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        if (nums[0] > 0 || nums[nums.length - 1] < 0) return new ArrayList<>();

        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int k = 0; k < n - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int target = -nums[k];
            int i = k + 1;
            int j = n - 1;
            while (i < j) {
                if (nums[i] + nums[j] == target) {
                    list.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;
                    i++;
                    j--;
                } else if (nums[i] + nums[j] < target) i++;
                else j--;
            }
        }
        return list;
    }
}
