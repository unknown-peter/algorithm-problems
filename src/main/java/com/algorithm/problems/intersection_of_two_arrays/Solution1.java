/**
 * Leetcode - intersection_of_two_arrays
 */
package com.algorithm.problems.intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int num : nums1) nums1Set.add(num);
        for (int num : nums2) nums2Set.add(num);
        nums1Set.retainAll(nums2Set);

        int[] nums = new int[nums1Set.size()];
        int i = 0;
        for (int num : nums1Set) nums[i++] = num;

        return nums;
    }
}
