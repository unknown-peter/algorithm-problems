/**
 * Leetcode - sort_array_by_parity
 */
package com.algorithm.problems.sort_array_by_parity;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];

        return ans;
    }
}
