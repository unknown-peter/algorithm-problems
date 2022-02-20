/**
 * Leetcode - n_repeated_element_in_size_2n_array
 */
package com.algorithm.problems.n_repeated_element_in_size_2n_array;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return num;
            set.add(num);
        }
        return -1;
    }
}
