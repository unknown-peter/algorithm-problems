/**
 * Leetcode - fibonacci_number
 */
package com.algorithm.problems.fibonacci_number;

class Solution1 implements Solution {

    @Override
    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
