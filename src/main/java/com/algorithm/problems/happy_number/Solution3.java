/**
 * Leetcode - happy_number
 */
package com.algorithm.problems.happy_number;

class Solution3 implements Solution {

    /**
     * 快慢指针计算平方和，看环是否落在1的位置
     */
    @Override
    public boolean isHappy(int n) {
        int fast = n, slow = n;

        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int findSquareSum(int num) {
        int sum = 0, digit;

        while (num > 0) {
            digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }
}
