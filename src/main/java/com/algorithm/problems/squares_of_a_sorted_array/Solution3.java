/**
 * Leetcode - squares_of_a_sorted_array
 */
package com.algorithm.problems.squares_of_a_sorted_array;

class Solution3 implements Solution {

    /**
     * 双指针比较nums中元素的绝对值，由高到低排序
     */
    @Override
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        int i = nums.length - 1;
        int[] res = new int[nums.length];
        while (l <= h) {
            if (Math.abs(nums[l]) > Math.abs(nums[h])) {
                res[i--] = nums[l] * nums[l];
                l++;
            } else {
                res[i--] = nums[h] * nums[h];
                h--;
            }
        }
        return res;
    }
}
