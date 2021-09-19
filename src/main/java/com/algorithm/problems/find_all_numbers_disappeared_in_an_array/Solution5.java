/**
 * Leetcode - find_all_numbers_disappeared_in_an_array
 */
package com.algorithm.problems.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

class Solution5 implements Solution {

    /**
     * 在nums[nums[i] - 1]累加数组长度n
     * 遍历nums，如果nums[i] <= n，则i+1为disappeared number
     */
    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[(nums[i] - 1) % n] += n;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= n) list.add(i + 1);
        }
        return list;
    }
}
