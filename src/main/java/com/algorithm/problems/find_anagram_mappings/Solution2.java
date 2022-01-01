/**
 * Leetcode - find_anagram_mappings
 */
package com.algorithm.problems.find_anagram_mappings;

import java.util.Arrays;

class Solution2 implements Solution {

    @Override
    public int[] anagramMappings(int[] A, int[] B) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            A[i] = (A[i] << 8) + i;
            B[i] = (B[i] << 8) + i;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++)
            ans[A[i] & 0xFF] = B[i] & 0xFF;
        return ans;
    }
}
