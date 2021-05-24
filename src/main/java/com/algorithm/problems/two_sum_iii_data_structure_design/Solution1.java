/**
 * Leetcode - two_sum_iii_data_structure_design
 */
package com.algorithm.problems.two_sum_iii_data_structure_design;

import java.util.Arrays;

class Solution1 implements Solution {

    private int[] nums;

    private int index;

    @Override
    public Boolean[] twoSumOperate(String operates) {
        nums = new int[16];
        index = 0;
        String[] operate = operates.split(",");
        Boolean[] result = new Boolean[operate.length];

        for (int i = 0; i < operate.length; i++) {
            if (operate[i].startsWith("add")) {
                String num = operate[i].substring(4, operate[i].length() - 1);
                add(Integer.parseInt(num));
                result[i] = null;
            } else if (operate[i].startsWith("find")) {
                String num = operate[i].substring(5, operate[i].length() - 1);
                result[i] = find(Integer.parseInt(num));
            }
        }
        return result;
    }

    private void add(int number) {
        if (index >= nums.length) {
            nums = Arrays.copyOf(nums, 2 * nums.length);
        }
        int pos = 0;
        while (pos < index) {
            if (nums[pos] <= number) pos++;
            else break;
        }
        for (int i = index - 1; i >= pos; i--) {
            nums[i + 1] = nums[i];
        }
        nums[pos] = number;
        index++;
    }

    private boolean find(int value) {
        int i = 0;
        int j = index - 1;
        while (i < j) {
            int v2 = value - nums[i];
            if (v2 == nums[j]) return true;
            if (v2 < nums[j]) j--;
            else i++;
        }
        return false;
    }
}
