/**
 * Leetcode - remove_duplicates_from_sorted_array
 */
package com.algorithm.problems.remove_duplicates_from_sorted_array;

class Solution1 implements Solution {

    @Override
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int preIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[preIndex]) {
                preIndex++;
                nums[preIndex] = nums[i];
            }
        }
        return (preIndex + 1);
    }

}
