/**
 * Leetcode - two_sum_2_input_array_is_sorted
 */
package com.algorithm.problems.two_sum_2_input_array_is_sorted;

class Solution2 implements Solution {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) return new int[]{i + 1, j + 1};
            if (sum > target) j--;
            else i++;
        }
        return null;
    }
}
