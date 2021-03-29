/**
 * Leetcode - climbing_stairs
 */
package com.algorithm.problems.climbing_stairs;

class Solution1 implements Solution {

    /**
     * f(n) = f(n-1) + f(n-2)
     * 递归计算f(n)
     */
    @Override
    public int climbStairs(int n) {
        if (n <= 0)
            throw new RuntimeException("invalid parameter");
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    //    public int climbStairs(int n) {
    //        climb_Stairs(0, n);
    //    }
    //    public int climb_Stairs(int i, int n) {
    //        if (i > n) {
    //            return 0;
    //        }
    //        if (i == n) {
    //            return 1;
    //        }
    //        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    //    }

    //    public int climbStairs(int n) {
    //        int memo[] = new int[n + 1];
    //        return climb_Stairs(0, n, memo);
    //    }
    //    public int climb_Stairs(int i, int n, int memo[]) {
    //        if (i > n) {
    //            return 0;
    //        }
    //        if (i == n) {
    //            return 1;
    //        }
    //        if (memo[i] > 0) {
    //            return memo[i];
    //        }
    //        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
    //        return memo[i];
    //    }

}
