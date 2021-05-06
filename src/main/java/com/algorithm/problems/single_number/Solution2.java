/**
 * Leetcode - single_number
 */
package com.algorithm.problems.single_number;

import java.util.HashMap;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
