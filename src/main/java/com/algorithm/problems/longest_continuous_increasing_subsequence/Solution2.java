/**
 * Leetcode - longest_continuous_increasing_subsequence
 */
package com.algorithm.problems.longest_continuous_increasing_subsequence;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 滑动窗口，遇到nums[i - 1] >= nums[i]的情况设置锚点为当前index
     */
    @Override
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0, anchor = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > 0 && nums[i - 1] >= nums[i]) anchor = i;
            ans = Math.max(ans, i - anchor + 1);
        }
        return ans;
    }
}
