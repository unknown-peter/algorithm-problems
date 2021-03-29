/**
 * Leetcode - remove_element
 */
package com.algorithm.problems.remove_element;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

}
