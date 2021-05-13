/**
 * Leetcode - missing_ranges
 */
package com.algorithm.problems.missing_ranges;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        if ((lower + 1) == nums[0]) result.add(String.valueOf(lower));
        else if ((lower + 1) < nums[0]) result.add(lower + "->" + (nums[0] - 1));
        int pre = nums[0];
        for (int num : nums) {
            if (pre == num) continue;
            if (pre < (num - 2)) result.add((pre + 1) + "->" + (num - 1));
            else if (pre == (num - 2)) result.add(String.valueOf(pre + 1));
            pre = num;
        }
        if (nums[nums.length - 1] == (upper - 1)) result.add(String.valueOf(upper));
        else if (nums[nums.length - 1] < (upper - 1)) result.add((nums[nums.length - 1] + 1) + "->" + upper);
        return result;
    }

}
