/**
 * Leetcode - majority_element
 */
package com.algorithm.problems.majority_element;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            Integer count = numCountMap.get(num);
            numCountMap.put(num, (count == null) ? 1 : count + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) return entry.getKey();
        }
        return 0;
    }
}
