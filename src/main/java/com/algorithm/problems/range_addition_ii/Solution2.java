/**
 * Leetcode - range_addition_ii
 */
package com.algorithm.problems.range_addition_ii;

class Solution2 implements Solution {

    @Override
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        if (ops.length == 1) return ops[0][0] * ops[0][1];

        int r = m;
        int c = n;
        for (int i = 0; i < ops.length; i++) {
            r = Math.min(r, ops[i][0]);
            c = Math.min(c, ops[i][1]);
        }
        return r * c;
    }
}
