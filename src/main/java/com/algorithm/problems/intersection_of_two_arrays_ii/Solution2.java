/**
 * Leetcode - intersection_of_two_arrays_ii
 */
package com.algorithm.problems.intersection_of_two_arrays_ii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        for (int num : nums1) {
            Integer count = nums1Map.get(num);
            if (count == null) count = 0;
            nums1Map.put(num, count + 1);
        }

        int[] array = new int[Math.min(nums1.length, nums2.length)];
        int i = 0;
        for (int num : nums2) {
            Integer count = nums1Map.get(num);
            if (count != null && count != 0) {
                array[i++] = num;
                nums1Map.put(num, count - 1);
            }
        }

        return Arrays.copyOf(array, i);
    }
}
