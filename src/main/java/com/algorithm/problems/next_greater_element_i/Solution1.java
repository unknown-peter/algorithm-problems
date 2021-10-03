/**
 * Leetcode - next_greater_element_i
 */
package com.algorithm.problems.next_greater_element_i;

class Solution1 implements Solution {

    @Override
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (nums2[j] != nums1[i]) j++;
            for (; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    break;
                }
            }
            if (j == nums2.length) res[i] = -1;
        }
        return res;
    }
}
