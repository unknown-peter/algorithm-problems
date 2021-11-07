/**
 * Leetcode - longest_harmonious_subsequence
 */
package com.algorithm.problems.longest_harmonious_subsequence;

import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    @Override
    public int findLHS(int[] nums) {
        int res = 0;
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            Integer count = numCountMap.get(num);
            if (count == null) count = 0;
            numCountMap.put(num, count + 1);
        }
        Integer[] numArray = numCountMap.keySet().stream().sorted().toArray(Integer[]::new);
        for (int i = 1; i < numArray.length; i++) {
            if ((numArray[i] - numArray[i - 1]) == 1)
                res = Math.max(res, numCountMap.get(numArray[i]) + numCountMap.get(numArray[i - 1]));
        }
        return res;
    }
}
