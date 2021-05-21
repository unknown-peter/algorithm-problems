/**
 * Leetcode - majority_element
 */
package com.algorithm.problems.majority_element;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }
        }
        return -1;
    }
}
