/**
 * Leetcode - find_the_town_judge
 */
package com.algorithm.problems.find_the_town_judge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Set<Integer>> trustSetMap = new HashMap<>();
        Set<Integer> trustNobodys = new HashSet<>();

        for (int i = 0; i < n; i++) trustNobodys.add(i);

        for (int[] pair : trust) {
            trustNobodys.remove(pair[0] - 1);
            Set<Integer> set = trustSetMap.getOrDefault(pair[1] - 1, new HashSet<Integer>());
            set.add(pair[0] - 1);
            trustSetMap.put(pair[1] - 1, set);
        }

        for (Integer trustNobody : trustNobodys) {
            Set<Integer> set = trustSetMap.getOrDefault(trustNobody, new HashSet<Integer>());
            if (set.size() == n - 1) return trustNobody + 1;
        }
        return -1;
    }
}
