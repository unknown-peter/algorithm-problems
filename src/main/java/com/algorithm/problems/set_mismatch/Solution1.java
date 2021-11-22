/**
 * Leetcode - set_mismatch
 */
package com.algorithm.problems.set_mismatch;

class Solution1 implements Solution {

    @Override
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i] - 1]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 2) res[0] = i + 1;
            if (count[i] == 0) res[1] = i + 1;
        }
        return res;
    }
}
