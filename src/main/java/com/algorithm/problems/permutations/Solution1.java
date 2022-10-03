/**
 * Leetcode - permutations
 */
package com.algorithm.problems.permutations;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    private List<List<Integer>> res = new ArrayList<>();

    @Override
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, list);
        return res;
    }

    private void dfs(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                dfs(nums, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
