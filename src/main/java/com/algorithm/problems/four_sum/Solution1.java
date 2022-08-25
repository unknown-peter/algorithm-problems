/**
 * Leetcode - four_sum
 */
package com.algorithm.problems.four_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        if ((target < 0 && nums[0] >= 0) || (target > 0 && nums[n - 1] <= 0)) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > (i + 1) && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long val = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (val == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while (k < l && nums[k] == nums[k + 1]) k++;
                        while (k < l && nums[l] == nums[l - 1]) l--;
                        k++;
                        l--;
                    } else if (val > target) l--;
                    else k++;
                }
            }
        }
        return res;
    }
}
