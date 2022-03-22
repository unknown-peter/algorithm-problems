/**
 * Leetcode - two_sum_less_than_k
 */
package com.algorithm.problems.two_sum_less_than_k;

import java.util.Arrays;

class Solution2 implements Solution {

    @Override
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        int res = -1;
        while (i < j) {
            int tmp = A[i] + A[j];
            if (tmp >= K) j--;
            else {
                if (tmp > res) res = tmp;
                i++;
            }
        }
        return res;
    }
}
