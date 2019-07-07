/**
 * Leetcode - climbing_stairs
 */
package com.algorithmproblems.climbing_stairs;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     *       _          _   _   _     _               _     _          _
     * Qn = | Fn    Fn-1 | | 1 1 | = | Fn+Fn-1    Fn   | = | Fn+1  Fn   |
     *      |_Fn-1  Fn-2_| |_1 0_|   |_Fn-1+Fn-2  Fn-1_|   |_Fn    Fn-1_|
     * Fn = Qn-1[0,0]
     */
    @Override
    public int climbStairs(int n) {
        int[][] q = {{1, 1}, {1, 0}};
        int[][] res = pow(q, n);
        return res[0][0];
    }

    public int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    public int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }

}
