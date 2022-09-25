/**
 * Leetcode - first_missing_positive
 */
package com.algorithm.problems.first_missing_positive;

class Solution1 implements Solution {

    @Override
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) arr[num] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            if (!arr[i]) return i;
        }
        return n + 1;
    }
}
