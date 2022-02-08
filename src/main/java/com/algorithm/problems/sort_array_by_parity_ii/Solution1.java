/**
 * Leetcode - sort_array_by_parity_ii
 */
package com.algorithm.problems.sort_array_by_parity_ii;

class Solution1 implements Solution {

    @Override
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[i] = num;
                i += 2;
            } else {
                res[j] = num;
                j += 2;
            }
        }
        return res;
    }
}
