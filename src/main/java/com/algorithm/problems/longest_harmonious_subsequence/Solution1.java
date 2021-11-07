/**
 * Leetcode - longest_harmonious_subsequence
 */
package com.algorithm.problems.longest_harmonious_subsequence;

import java.util.Arrays;

class Solution1 implements Solution {

    /**
     * 数组排序，遍历计算当前值的元素的数量到curCount，
     * 如果下一个值与其相差1则preCount=curCount并遍历计算值的元素数量到curCount
     * 如果preCount、curCount均不为0，则相加和sum取最大值
     */
    @Override
    public int findLHS(int[] nums) {
        int preCount = 0;
        int curCount = 1;
        int sum = 0;
        Arrays.sort(nums);
        int i = 1;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == nums[i - 1]) {
                curCount++;
                i++;
            }
            if (preCount != 0 && curCount != 0) sum = Math.max(sum, preCount + curCount);
            if (i >= nums.length) break;
            if ((nums[i] - nums[i - 1]) == 1) {
                preCount = curCount;
                curCount = 1;
            } else {
                preCount = 0;
                curCount = 1;
            }
            i++;
        }
        if (preCount != 0 && curCount != 0) sum = Math.max(sum, preCount + curCount);
        return sum;
    }
}
