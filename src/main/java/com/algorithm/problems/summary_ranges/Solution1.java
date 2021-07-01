/**
 * Leetcode - summary_ranges
 */
package com.algorithm.problems.summary_ranges;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        List<String> list = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];
        for (int num : nums) {
            if (num <= (end + 1)) end = num;
            else {
                if (start == end) list.add(String.valueOf(start));
                else list.add(start + "->" + end);
                start = num;
                end = num;
            }
        }
        if (start == end) list.add(String.valueOf(start));
        else list.add(start + "->" + end);
        return list;
    }
}
