/**
 * Leetcode - fixed_point
 */
package com.algorithm.problems.fixed_point;

class Solution1 implements Solution {

    @Override
    public int fixedPoint(int[] A) {
        int res = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == i) return i;
        }
        return res;
    }
}
