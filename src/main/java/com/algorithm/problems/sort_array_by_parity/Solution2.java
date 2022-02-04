/**
 * Leetcode - sort_array_by_parity
 */
package com.algorithm.problems.sort_array_by_parity;

class Solution2 implements Solution {

    @Override
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < j && (nums[i] % 2 == 0)) i++;
            while (i < j && (nums[j] % 2 != 0)) j--;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;

//        int i = 0, j = A.length - 1;
//        while (i < j) {
//            if (A[i] % 2 > A[j] % 2) {
//                int tmp = A[i];
//                A[i] = A[j];
//                A[j] = tmp;
//            }
//
//            if (A[i] % 2 == 0) i++;
//            if (A[j] % 2 == 1) j--;
//        }
//
//        return A;
    }
}
