/**
 * Leetcode - divisor_game
 */
package com.algorithm.problems.divisor_game;

class Solution1 implements Solution {

    /**
     * 如果n为2，则Alice拿掉1，只剩下1给Bob，则Bob输
     * 当n为奇数时，其因数只可能为奇数，减掉之后留给Bob则为偶数。Bob再减1继续给Alice奇数。最终到Bob最小偶数2，则Alice输
     * 当n为偶数时，Alice拿掉1，留给Bob奇数，则由上可知Bob输
     * 因此偶数Alice赢，奇数Alice输
     */
    @Override
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
