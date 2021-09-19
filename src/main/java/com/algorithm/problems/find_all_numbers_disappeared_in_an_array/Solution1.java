/**
 * Leetcode - find_all_numbers_disappeared_in_an_array
 */
package com.algorithm.problems.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) list.add(i);
        }
        return list;
    }
}
