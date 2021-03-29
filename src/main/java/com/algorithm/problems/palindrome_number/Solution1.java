/**
 * Leetcode - palindrome_number
 */
package com.algorithm.problems.palindrome_number;

class Solution1 implements Solution {

    /**
     * 将x翻转之后判断xrev和x是否相等，判断是否是回文
     */
    @Override
    public boolean isPalindrome(int x) {
        if ((x < 0) || (x % 10 == 0 && x != 0))
            return false;

        int remainder = x;
        int rev = 0;
        while (remainder != 0) {
            int pop = remainder % 10;
            remainder /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return false;
            rev = rev * 10 + pop;
        }
        
        return x == rev;
    }

}
