/**
 * Leetcode - climbing_stairs
 */
package com.algorithm.problems.climbing_stairs;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     * Fn+2 = Fn+1 + Fn.  a^(n+2) = a^(n+1) + a^n  a^2-a-1=0  a=1/√5((1±√5)/2)
     * Fn = A((1+√5)/2)^n + B((1-√5)/2)^n  A=(1+√5)/2√5  B=(1-√5)/2√5
     * Fn = 1/√5[((1+√5)/2)^(n+1) - ((1-√5)/2)^(n+1)]
     */
    @Override
    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) (fibn / sqrt5);
    }

}
