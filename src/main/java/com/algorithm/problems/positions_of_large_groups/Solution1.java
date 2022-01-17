/**
 * Leetcode - positions_of_large_groups
 */
package com.algorithm.problems.positions_of_large_groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public List<List<Integer>> largeGroupPositions(String s) {
        char c = s.charAt(0);
        int cNum = 0;
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i) == c) cNum++;
            else {
                if (cNum >= 3) res.add(Arrays.asList(i - cNum, i - 1));
                c = s.charAt(i);
                cNum = 1;
            }
        }
        if (cNum >= 3) res.add(Arrays.asList(i - cNum, i - 1));
        return res;
    }
}
