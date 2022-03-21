/**
 * Leetcode - duplicate_zeros
 */
package com.algorithm.problems.duplicate_zeros;

class Solution1 implements Solution {

    @Override
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                if (i < arr.length - 2) {
                    System.arraycopy(arr, i + 1, arr, i + 2, arr.length - 2 - i);
                }
                arr[++i] = 0;
            }
        }
    }
}
