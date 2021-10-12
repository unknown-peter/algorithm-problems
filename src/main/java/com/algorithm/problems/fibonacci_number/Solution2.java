/**
 * Leetcode - fibonacci_number
 */
package com.algorithm.problems.fibonacci_number;

class Solution2 implements Solution {

    @Override
    public int fib(int n) {
        if (n == 0 || n == 1) return n;

        int a = 0;
        int b = 1;
        int tmp;
        for (int i = 2; i < n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return a + b;
    }
}
