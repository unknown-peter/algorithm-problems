/**
 * Leetcode - search_in_rotated_sorted_array
 */
package com.algorithm.problems.search_in_rotated_sorted_array;

class Solution2 implements Solution {

    /**
     * 二分法求target所在的数组位置
     * 比较中间位置元素值和右边界元素大小，如果中间位置值小于右边界值，则中间向右单调递增，如果目标值大于中间位置值且小于右边界值，
     * 则其在中间值右边，继续搜索右半边，否则搜索左半边；如果中间位置值大于右边界值，则左边界至中间位置单调递增，如果目标值小于
     * 中间位置值且大于左边界值，则其在中间值左边，继续搜索左半边，否则搜索右半边
     */
    @Override
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < nums[r]) {
                if (nums[mid] < target && nums[r] >= target) l = mid + 1;
                else r = mid - 1;
            } else {
                if (nums[mid] > target && nums[l] <= target) r = mid - 1;
                else l = mid + 1;
            }
        }
        return -1;
    }
}
