/**
 * Leetcode - contains_duplicate_ii
 */
package com.algorithm.problems.contains_duplicate_ii;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null && (i - index) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
