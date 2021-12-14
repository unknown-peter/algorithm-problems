/**
 * Leetcode - binary_search
 */
package com.algorithm.problems.binary_search;

class Solution2 implements Solution {

    @Override
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int tmp;
        while (l <= h) {
            tmp = l + (h - l) / 2;
            if (nums[tmp] == target) return tmp;
            if (nums[tmp] < target) l = tmp + 1;
            else h = tmp - 1;
        }
        return -1;
    }
}
