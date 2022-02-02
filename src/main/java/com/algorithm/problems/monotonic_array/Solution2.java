/**
 * Leetcode - monotonic_array
 */
package com.algorithm.problems.monotonic_array;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean isMonotonic(int[] A) {
        int store = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            int c = Integer.compare(A[i], A[i + 1]);
            if (c != 0) {
                if (c != store && store != 0)
                    return false;
                store = c;
            }
        }

        return true;
    }
}
