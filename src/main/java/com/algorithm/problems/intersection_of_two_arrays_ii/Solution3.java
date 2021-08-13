/**
 * Leetcode - intersection_of_two_arrays_ii
 */
package com.algorithm.problems.intersection_of_two_arrays_ii;

import java.util.Arrays;

class Solution3 implements Solution {

    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int index = 0;
        int[] array = new int[Math.min(nums1.length, nums2.length)];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                array[index++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) i++;
            else j++;
        }
        return Arrays.copyOf(array, index);
    }
}
