/**
 * Leetcode - climbing_stairs
 */
package com.algorithmproblems.climbing_stairs;

class Solution2 implements Solution {

    /**
     * f(n) = f(n-1) + f(n-2)
     * 从1到n循环计算f(n),保存中间结果
     */
    @Override
    public int climbStairs(int n) {
        if (n <= 0)
            throw new RuntimeException("invalid parameter");

        int fn1 = 1, fn2 = 0;
        int fn = 0;
        for (int i = 1; i <= n; i++) {
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }
        return fn;
    }

    //    public int climbStairs(int n) {
    //        if (n == 1) {
    //            return 1;
    //        }
    //        int[] dp = new int[n + 1];
    //        dp[1] = 1;
    //        dp[2] = 2;
    //        for (int i = 3; i <= n; i++) {
    //            dp[i] = dp[i - 1] + dp[i - 2];
    //        }
    //        return dp[n];
    //    }

}
