/**
 * Leetcode - degree_of_an_array
 */
package com.algorithm.problems.degree_of_an_array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        int maxCount = 0;
        for (int num : nums) {
            int count = numCountMap.getOrDefault(num, 0);
            numCountMap.put(num, count + 1);
            maxCount = Math.max(maxCount, count + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            if (entry.getValue().equals(maxCount)) set.add(entry.getKey());
        }
        int res = Integer.MAX_VALUE;
        for (Integer num : set) {
            int i = 0;
            int j = nums.length - 1;
            while (nums[i] != num) i++;
            while (nums[j] != num) j--;
            res = Math.min(res, j - i + 1);
        }
        return res;
    }
}
