/**
 * Leetcode - find_anagram_mappings
 */
package com.algorithm.problems.find_anagram_mappings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, List<Integer>> valueIndexMap = new HashMap<>();
        int[] res = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            valueIndexMap.computeIfAbsent(B[i], k -> new ArrayList<>()).add(i);
        }
        for (int i = 0; i < B.length; i++) {
            List<Integer> list = valueIndexMap.get(A[i]);
            res[i] = list.remove(list.size() - 1);
        }
        return res;
    }
}
