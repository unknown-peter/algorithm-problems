/**
 * Leetcode - monotonic_array
 */
package com.algorithm.problems.monotonic_array;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i + 1])
                increasing = false;
            if (A[i] < A[i + 1])
                decreasing = false;
        }

        return increasing || decreasing;
    }
}
