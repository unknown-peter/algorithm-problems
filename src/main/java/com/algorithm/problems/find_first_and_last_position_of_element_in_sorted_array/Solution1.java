/**
 * Leetcode - find_first_and_last_position_of_element_in_sorted_array
 */
package com.algorithm.problems.find_first_and_last_position_of_element_in_sorted_array;

class Solution1 implements Solution {

    @Override
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                int leftInd = scanLeft(nums, mid);
                int rightInd = scanRight(nums, mid);
                return new int[] {leftInd, rightInd};
            } else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return new int[] {-1, -1};
    }

    private int scanLeft(int[] nums, int ind) {
        int l = 0;
        int r = ind;
        int res = ind;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == nums[ind]) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    private int scanRight(int[] nums, int ind) {
        int l = ind;
        int r = nums.length - 1;
        int res = ind;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == nums[ind]) {
                res = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return res;
    }
}
