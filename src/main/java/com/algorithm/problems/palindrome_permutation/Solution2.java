/**
 * Leetcode - palindrome_permutation
 */
package com.algorithm.problems.palindrome_permutation;

import java.util.HashSet;
import java.util.Set;

class Solution2 implements Solution {

    @Override
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) set.remove(s.charAt(i));
            else set.add(s.charAt(i));
        }
        return set.isEmpty() || set.size() == 1;
    }
}
