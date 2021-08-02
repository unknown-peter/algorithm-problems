/**
 * Leetcode - move_zeroes
 */
package com.algorithm.problems.move_zeroes;

import java.util.Vector;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        // Count the zeroes
        int numZeroes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) numZeroes++;
        }

        // Make all the non-zero elements retain their original order.
        Vector<Integer> ans = new Vector<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                ans.add(nums[i]);
            }
        }

        // Move all zeroes to the end
        while (numZeroes-- != 0) {
            ans.add(0);
        }

        // Combine the result
        for (int i = 0; i < n; i++) {
            nums[i] = ans.get(i);
        }
    }
}
