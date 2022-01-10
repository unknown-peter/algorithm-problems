/**
 * Leetcode - rotate_string
 */
package com.algorithm.problems.rotate_string;

import java.util.Arrays;

class Solution5 implements Solution {

    /**
     * solution from leetcode
     * KMP算法，shifts数组保存当前字符不匹配时要向前回溯的距离
     *     a b c a b d a b e
     *   1 1 2 3 3 3 6 6 6 9
     */
    @Override
    public boolean rotateString(String A, String B) {
        int N = A.length();
        if (N != B.length()) return false;
        if (N == 0) return true;

        //Compute shift table
        int[] shifts = new int[N + 1];
        Arrays.fill(shifts, 1);
        int left = -1;
        for (int right = 0; right < N; ++right) {
            while (left >= 0 && (B.charAt(left) != B.charAt(right)))
                left -= shifts[left];
            shifts[right + 1] = right - left++;
        }

        //Find match of B in A+A
        int matchLen = 0;
        for (char c : (A + A).toCharArray()) {
            while (matchLen >= 0 && B.charAt(matchLen) != c)
                matchLen -= shifts[matchLen];
            if (++matchLen == N) return true;
        }

        return false;
    }
}
