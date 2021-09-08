/**
 * Leetcode - third_maximum_number
 */
package com.algorithm.problems.third_maximum_number;

import java.util.TreeSet;

class Solution2 implements Solution {

    @Override
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) set.pollFirst();
        }
        return set.size() < 3 ? set.last() : set.first();
    }
}
