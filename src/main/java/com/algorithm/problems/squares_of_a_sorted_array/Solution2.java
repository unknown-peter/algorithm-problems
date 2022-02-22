/**
 * Leetcode - squares_of_a_sorted_array
 */
package com.algorithm.problems.squares_of_a_sorted_array;

class Solution2 implements Solution {

    @Override
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if (nums[0] >= 0) {
            for (int i = 0; i < n; i++) nums[i] = nums[i] * nums[i];
            return nums;
        } else if (nums[n - 1] <= 0) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) res[n - 1 - i] = nums[i] * nums[i];
            return res;
        } else {
            int index1 = 0;
            int[] array1 = new int[n];
            int index2 = 0;
            int[] array2 = new int[n];
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0) break;
                array1[index1++] = nums[i] * nums[i];
            }
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] <= 0) break;
                array2[index2++] = nums[i] * nums[i];
            }

            int i = 0;
            int[] res = new int[n];
            while (index1 > 0 || index2 > 0) {
                if (index1 <= 0) res[i++] = array2[--index2];
                else if (index2 <= 0) res[i++] = array1[--index1];
                else {
                    if (array1[index1 - 1] < array2[index2 - 1]) res[i++] = array1[--index1];
                    else res[i++] = array2[--index2];
                }
            }
            return res;
        }
    }
}
