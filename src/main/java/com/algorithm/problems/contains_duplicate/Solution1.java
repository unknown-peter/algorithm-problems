/**
 * Leetcode - contains_duplicate
 */
package com.algorithm.problems.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
