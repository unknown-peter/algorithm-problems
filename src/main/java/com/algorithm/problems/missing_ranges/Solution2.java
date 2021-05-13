/**
 * Leetcode - missing_ranges
 */
package com.algorithm.problems.missing_ranges;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    @Override
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int preVal = lower;
        for (int num : nums) {
            if (preVal == num) {
                if (num == Integer.MAX_VALUE) return result;
                preVal++;
                continue;
            }
            if (preVal < num) result.add(genRange(preVal, num - 1));
            if (num == Integer.MAX_VALUE) return result;
            preVal = num + 1;
        }
        if (preVal <= upper) result.add(genRange(preVal, upper));
        return result;
    }

    private String genRange(int from, int to) {
        return (from == to) ? String.valueOf(from) : (from + "->" + to);
    }
}
