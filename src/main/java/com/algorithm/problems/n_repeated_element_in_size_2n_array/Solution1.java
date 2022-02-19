/**
 * Leetcode - n_repeated_element_in_size_2n_array
 */
package com.algorithm.problems.n_repeated_element_in_size_2n_array;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            Integer count = numCountMap.getOrDefault(num, 0);
            if (count > 0) return num;
            numCountMap.put(num, count + 1);
        }
        return -1;
    }
}
