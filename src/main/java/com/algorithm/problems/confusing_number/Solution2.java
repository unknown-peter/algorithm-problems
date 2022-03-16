/**
 * Leetcode - confusing_number
 */
package com.algorithm.problems.confusing_number;

class Solution2 implements Solution {

    private int[] rotate = new int[]{0, 1, -1, -1, -1, -1, 9, -1, 8, 6};

    @Override
    public boolean confusingNumber(int N) {
        String numStr = String.valueOf(N);
        int left = 0;
        int right = numStr.length() - 1;
        boolean isConfusingNumber = false;
        while (left <= right) {
            if (rotate[numStr.charAt(left) - '0'] == -1 || rotate[numStr.charAt(right) - '0'] == -1) return false;
            if (rotate[numStr.charAt(left) - '0'] != (numStr.charAt(right) - '0')) isConfusingNumber = true;
            left++;
            right--;
        }
        return isConfusingNumber;
    }
}
