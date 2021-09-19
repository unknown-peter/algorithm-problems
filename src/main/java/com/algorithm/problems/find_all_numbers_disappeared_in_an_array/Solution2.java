/**
 * Leetcode - find_all_numbers_disappeared_in_an_array
 */
package com.algorithm.problems.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution2 implements Solution {

    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) list.add(i);
        for (int num : nums) list.set(num - 1, null);
        list.removeIf(Objects::isNull);
        return list;
    }
}
