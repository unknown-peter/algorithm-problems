/**
 * Leetcode - partition_array_into_three_parts_with_equal_sum
 */
package com.algorithm.problems.partition_array_into_three_parts_with_equal_sum;

class Solution1 implements Solution {

    @Override
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        if (sum % 3 != 0) return false;

        sum /= 3;
        int count = 0;
        int curSum = 0;
        for (int num : arr) {
            curSum += num;
            if (curSum == sum) {
                count++;
                curSum = 0;
            }
        }
        return count >= 3;
    }
}
