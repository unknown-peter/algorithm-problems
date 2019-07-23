/**
 * Leetcode - merge_sorted_array
 */
package com.algorithmproblems.merge_sorted_array;

class Solution1 implements Solution {

    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        for (int j = 0; j < n; j++) {
            while (i < m && nums1[i + j] <= nums2[j])
                i++;
            // nums1中未处理的元素向后移一位，插入nums2对应元素
            System.arraycopy(nums1, i + j, nums1, i + j + 1, m - i);
            nums1[i + j] = nums2[j];
        }
    }

}
