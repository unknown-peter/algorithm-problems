/**
 * Leetcode - next_permutation
 */
package com.algorithm.problems.next_permutation;

class Solution1 implements Solution {

    /**
     * 对于降序排列的数组nums，下一排列为升序排列
     * 对于其他数组排列nums，需要从后往前找到相邻的两个nums[i-1]<nums[i]的元素。
     * 将i及其后的子数组由降序翻转为升序，交换nums[i-1]和之后第一个大于nums[i-1]的值。此即为下一排列
     * 1 5 8 4 7 6 5 3 1 --> 1 5 8 4 1 3 5 6 7  --> 1 5 8 5 1 3 4 6 7
     */
    @Override
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        for (; i > 0; i--) {
            if (nums[i - 1] < nums[i]) break;
        }
        int j = i;
        int k = nums.length - 1;
        while (j < k) {
            int tmp = nums[k];
            nums[k] = nums[j];
            nums[j] = tmp;
            j++;
            k--;
        }
        if (i != 0) {
            j = i;
            while (j < nums.length && nums[j] <= nums[i - 1]) j++;
            int tmp = nums[j];
            nums[j] = nums[i - 1];
            nums[i - 1] = tmp;
        }
    }
}
