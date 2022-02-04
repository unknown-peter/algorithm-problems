/**
 * Leetcode - sort_array_by_parity
 */
package com.algorithm.problems.sort_array_by_parity;

import java.util.ArrayList;
import java.util.List;

class Solution1 implements Solution {

    @Override
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) evenList.add(num);
            else oddList.add(num);
        }
        int[] res = new int[nums.length];
        int i = 0;
        for (Integer num : evenList) {
            res[i++] = num;
        }
        for (Integer num : oddList) {
            res[i++] = num;
        }
        return res;
    }
}
