/**
 * Leetcode - permutations
 */
package com.algorithm.problems.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution2 implements Solution {

    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }

    // 两两交换并向下递归
    private void backtrack(int[] nums, int ind, List<List<Integer>> res) {
        if (ind == nums.length) {
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = ind; i < nums.length; i++) {
            swap(nums, i, ind);
            backtrack(nums, ind + 1, res);
            swap(nums, ind, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
