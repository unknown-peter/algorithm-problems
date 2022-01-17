/**
 * Leetcode - positions_of_large_groups
 */
package com.algorithm.problems.positions_of_large_groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList();
        int i = 0, N = s.length(); // i is the start of each group
        for (int j = 0; j < N; ++j) {
            if (j == N - 1 || s.charAt(j) != s.charAt(j + 1)) {
                // Here, [i, j] represents a group.
                if (j - i + 1 >= 3)
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                i = j + 1;
            }
        }

        return ans;
    }
}
