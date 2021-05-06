/**
 * Leetcode - single_number
 */
package com.algorithm.problems.single_number;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();

        for (int i : nums) {
            if (!no_duplicate_list.contains(i)) {
                no_duplicate_list.add(i);
            } else {
                no_duplicate_list.remove(new Integer(i));
            }
        }
        return no_duplicate_list.get(0);
    }
}
