/**
 * Leetcode - longest_uncommon_subsequence_i
 */
package com.algorithm.problems.longest_uncommon_subsequence_i;

class Solution2 implements Solution {

    @Override
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }
}
