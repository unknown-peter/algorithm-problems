/**
 * Leetcode - perfect_number
 */
package com.algorithm.problems.perfect_number;

import java.util.Arrays;
import java.util.List;

class Solution3 implements Solution {

    private List<Integer> list = Arrays.asList(6, 28, 496, 8128, 33550336);

    @Override
    public boolean checkPerfectNumber(int num) {
        return list.contains(num);
    }
}
