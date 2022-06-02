/**
 * Leetcode - duplicate_zeros
 */
package com.algorithm.problems.duplicate_zeros;

class Solution2 implements Solution {

    /**
     * 计算数组中可能的0的数目possibleDups(不包含不能复制的在最右边界的0)
     * 最后的索引length_，则最终的数组仅包含从0到length_-possibleDups的元素及possibleDups个0
     * 从length_-possibleDups开始由右至左复制元素到最右边，如果元素是0则复制两次
     */
    @Override
    public void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}