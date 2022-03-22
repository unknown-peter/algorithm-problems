/**
 * Leetcode - two_sum_less_than_k
 */
package com.algorithm.problems.two_sum_less_than_k;

class Solution1 implements Solution {

    @Override
    public int twoSumLessThanK(int[] A, int K) {
        int res = -1;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int tmp = A[i] + A[j];
                if (tmp < K && res < tmp) res = tmp;
            }
        }
        return res;
    }
}
