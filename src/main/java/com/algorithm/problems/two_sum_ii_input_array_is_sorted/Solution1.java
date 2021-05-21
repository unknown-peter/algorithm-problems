/**
 * Leetcode - two_sum_2_input_array_is_sorted
 */
package com.algorithm.problems.two_sum_ii_input_array_is_sorted;

class Solution1 implements Solution {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int numTwo = target - numbers[i];
            while (numbers[j] > numTwo) j--;
            if (numbers[j] == numTwo) return new int[]{i + 1, j + 1};
            i++;
        }
        return null;
    }
}
