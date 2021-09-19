/**
 * Leetcode - find_all_numbers_disappeared_in_an_array
 */
package com.algorithm.problems.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

class Solution3 implements Solution {

    /**
     * 对数字nums[i]，将位置为nums[i]-1的元素nums[nums[i]-1]置为其相反数
     * 遍历nums，所有nums[i] > 0 对应的i+1则为disappeared number
     */
    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) nums[index] = -nums[index];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) list.add(i + 1);
        }
        return list;
    }
}
