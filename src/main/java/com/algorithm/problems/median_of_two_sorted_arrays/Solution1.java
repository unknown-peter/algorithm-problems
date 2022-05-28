/**
 * Leetcode - median_of_two_sorted_arrays
 */
package com.algorithm.problems.median_of_two_sorted_arrays;

class Solution1 implements Solution {

    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num = 0;
        int n = nums1.length + nums2.length;
        int ind1 = (n - 1) / 2;
        int ind2 = n / 2;
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < n; i++) {
            int tmp;
            if (p1 == nums1.length) tmp = nums2[p2++];
            else if (p2 == nums2.length) tmp = nums1[p1++];
            else {
                if (nums1[p1] > nums2[p2]) tmp = nums2[p2++];
                else tmp = nums1[p1++];
            }
            if (i == ind1) num += tmp;
            if (i == ind2) {
                num += tmp;
                break;
            }
        }
        return num / 2.0;
    }
}
