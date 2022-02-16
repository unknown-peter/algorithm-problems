/**
 * Leetcode - di_string_match
 */
package com.algorithm.problems.di_string_match;

class Solution1 implements Solution {

    /**
     * solution from leetcode
     * 遍历长度为N的字符串s，如果遇到'I'则从0开始递增赋值，如果遇到'D'则从N开始递减赋值
     */
    @Override
    public int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }
}
