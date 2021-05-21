/**
 * Leetcode - majority_element
 */
package com.algorithm.problems.majority_element;

class Solution6 implements Solution {

    /**
     * solution from leetcode
     * Boyer-Moore投票算法，以数组第一个元素作为选举者，遍历数组元素，如果值一样则计数+1，否则计数-1
     * 当计数减为0时换当前遍历元素作为选举者，遍历结束之后最终的结果即为majority element
     */
    @Override
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
