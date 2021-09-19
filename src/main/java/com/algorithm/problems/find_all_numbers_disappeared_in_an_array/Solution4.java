/**
 * Leetcode - find_all_numbers_disappeared_in_an_array
 */
package com.algorithm.problems.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

class Solution4 implements Solution {

    /**
     * 对数字nums[i]，如果nums[i] != nums[nums[i] - 1]，将两者对调
     * 遍历nums，如果nums[i] != (i + 1)则i+1为disappeared number
     */
    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
                --i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) list.add(i + 1);
        }
        return list;
    }
}
