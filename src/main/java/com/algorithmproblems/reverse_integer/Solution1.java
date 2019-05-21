/**
 * Leetcode - reverse_integer
 */
package com.algorithmproblems.reverse_integer;

class Solution1 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // rev*10+pop > 2147483647
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            // rev*10+pop < -2147483648
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
