/**
 * Leetcode - find_the_difference
 */
package com.algorithm.problems.find_the_difference;

class Solution3 implements Solution {

    @Override
    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int sum = 0;
        for (int i = 0; i < sArray.length; i++) {
            sum += tArray[i] - sArray[i];
        }
        return (char) (sum + tArray[tArray.length - 1]);
    }
}
