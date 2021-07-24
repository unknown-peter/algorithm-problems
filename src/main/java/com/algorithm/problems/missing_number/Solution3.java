/**
 * Leetcode - missing_number
 */
package com.algorithm.problems.missing_number;

import java.util.HashSet;
import java.util.Set;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }
}
