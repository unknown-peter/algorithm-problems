/**
 * Leetcode - valid_mountain_array
 */
package com.algorithm.problems.valid_mountain_array;

class Solution1 implements Solution {

    @Override
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int i = 1;
        for (; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) return false;
            if (arr[i - 1] > arr[i]) break;
        }
        if (i == arr.length) return false;

        int k = arr.length - 1;
        for (; k > 0; k--) {
            if (arr[k - 1] == arr[k]) return false;
            if (arr[k - 1] < arr[k]) break;
        }
        if (k == 0) return false;
        return i - 1 == k;
    }
}
