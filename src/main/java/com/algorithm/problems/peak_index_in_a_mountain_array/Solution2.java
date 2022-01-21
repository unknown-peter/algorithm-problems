/**
 * Leetcode - peak_index_in_a_mountain_array
 */
package com.algorithm.problems.peak_index_in_a_mountain_array;

class Solution2 implements Solution {

    @Override
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (arr[m] < arr[m + 1]) l = m + 1;
            else h = m;
        }
        return l;
    }
}
