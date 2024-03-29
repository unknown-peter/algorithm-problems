/**
 * Leetcode - longest_substring_without_repeating_characters
 */
package com.algorithm.problems.longest_substring_without_repeating_characters;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     * 滑动窗口
     */
    @Override
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}
