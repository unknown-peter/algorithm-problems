/**
 * Leetcode - peak_index_in_a_mountain_array
 */
package com.algorithm.problems.peak_index_in_a_mountain_array;

class Solution1 implements Solution {

    @Override
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] < arr[i]) return i;
        }
        return -1;

//        int i = 0;
//        while (arr[i] < arr[i+1]) i++;
//        return i;
    }
}
