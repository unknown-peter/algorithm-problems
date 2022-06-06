/**
 * Leetcode - three_sum
 */
package com.algorithm.problems.three_sum;

import javafx.util.Pair;

import java.util.*;

class Solution1 implements Solution {

    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) numIndexMap.put(nums[i], i);

        Set<Pair<Integer, Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Integer index = numIndexMap.get(-nums[i] - nums[j]);
                if (index != null && index > j) {
                    set.add(new Pair<>(nums[i], nums[j]));
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for (Pair<Integer, Integer> pair : set) {
            list.add(Arrays.asList(pair.getKey(), pair.getValue(), -pair.getKey() - pair.getValue()));
        }
        return list;
    }
}
