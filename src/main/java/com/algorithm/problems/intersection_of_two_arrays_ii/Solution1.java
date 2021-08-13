/**
 * Leetcode - intersection_of_two_arrays_ii
 */
package com.algorithm.problems.intersection_of_two_arrays_ii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        Map<Integer, Integer> nums2Map = new HashMap<>();
        for (int num : nums1) {
            Integer count = nums1Map.get(num);
            if (count == null) count = 0;
            nums1Map.put(num, count + 1);
        }
        for (int num : nums2) {
            Integer count = nums2Map.get(num);
            if (count == null) count = 0;
            nums2Map.put(num, count + 1);
        }

        int initSize = Math.min(nums1.length, nums2.length);
        if (nums1Map.size() < nums2Map.size()) return setIntersect(nums1Map, nums2Map, initSize);
        else return setIntersect(nums2Map, nums1Map, initSize);
    }

    private int[] setIntersect(Map<Integer, Integer> nums1Map, Map<Integer, Integer> nums2Map, int initSize) {
        int[] array = new int[initSize];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : nums1Map.entrySet()) {
            Integer count = nums2Map.get(entry.getKey());
            if (count != null) {
                int intersectNum = Math.min(entry.getValue(), count);
                while (intersectNum > 0) {
                    array[i++] = entry.getKey();
                    intersectNum--;
                }
            }
        }
        return Arrays.copyOf(array, i);
    }
}
