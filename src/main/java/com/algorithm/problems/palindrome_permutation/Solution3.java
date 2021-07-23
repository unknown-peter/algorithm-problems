/**
 * Leetcode - palindrome_permutation
 */
package com.algorithm.problems.palindrome_permutation;

import java.util.BitSet;

class Solution3 implements Solution {

    /**
     * 使用一个256位的BitSet，遍历字符串字符，将字符对应的二进制位翻转，
     * 最后统计BitSet中置位的位数
     */
    @Override
    public boolean canPermutePalindrome(String s) {
        BitSet bitSet = new BitSet(256);
        for (int i = 0; i < s.length(); i++) {
            bitSet.flip(s.charAt(i));
        }
        return bitSet.cardinality() < 2;
    }
}
