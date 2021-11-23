/**
 * Leetcode - set_mismatch
 */
package com.algorithm.problems.set_mismatch;

import java.util.HashMap;
import java.util.Map;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int dup = -1, missing = 1;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    dup = i;
            } else
                missing = i;
        }
        return new int[]{dup, missing};
    }
}
